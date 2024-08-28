use northwind;

SELECT 
    csm.first_name AS `alicinin adi`,
    emp.first_name AS `saticinin adi`,
    prd.product_name AS `mehsulun adi`
FROM
    orders ord
        INNER JOIN
    customers csm ON ord.customer_id = csm.id
        INNER JOIN
    employees emp ON emp.id = ord.employee_id
        INNER JOIN
    order_details ord_d ON ord_d.order_id = ord.id
        INNER JOIN
    products prd ON prd.id = ord_d.product_id;
    
# bu select satilan mehsulun adi, saticinin adi ve musterinin adini getirir.

#-------------------------------------------------------------------------------------------------------------
#----- selects 1 section  ---------

select * from customers;  -- bir tabledeki butun dsutunlari gormek ucun * operatorundan isdifade olunur
select first_name, last_name, address from customers;   -- sadece isdenilen sutunlari getirmey icin adlari ile yazilir 
select first_name adi, last_name soyadi, address adresi from customers;    -- sutunlarin adini isdenilen formada deyismek icin alias-lerden as lerden isdifade olunur

-- alias-lerin ferqli yazilislari 
-- select * from customers ctm;
-- select ctm.first_name as `adi`, ctm.last_name as `soyadi`, ctm.address as `adresi` from cutomers ctm;
-- ctm customers qisaltmasi ve ctm.first_name first_name customers tablesinden getirlmesini bildirir
-- birden cox table join edildiyi zaman column adlarinda qarisiglig yaranmamasi icin bildirilir

#------------------------------------------------------------------------------------------------------------------------
#----- section 2 where ------------------------

select * from customers ctm where ctm.city = 'Boston';              -- seheri boston olanlari getirsin 
select * from products prd where prd.target_level = 40 or prd.target_level = 50;

select * from products prd where prd.list_price > 5 and prd.list_price < 40;

-- id si 9 olan saticinin satdgi mehsullarin sayi
select count(*) from orders where employee_id=9;

select sum(unit_price), count(unit_price) from order_details where product_id=8;

select products.product_name ,count(*) from order_details 
	inner join products on order_details.product_id =  products.id 
    group by product_id;
    
-- hansi kateqoriyada nece mehsul var
select 
	product_name as `Mehsulun adi` ,
    count(*) as `Bu kateqoriyadaki mehsullarin sayi` 
from products 
group by category;

-- kateqiriyaya aid mehsullarin sayi 3 den az olan kateqoriyalar
select 
	product_name as `Mehsulun adi`,
    count(*) total
from products
group by category having total <= 3; 

-- satisi az olan ve ya olmayan productlar 

select 
	p.product_name as `Mehsulun adi`, 
    count(od.order_id) `Mece eded satilib`
from order_details od
right join products p on p.id = od.product_id
group by p.product_name;

-- sifarisi olmayan musteriler 
select 
	c.id as `Musterinin id-si`, 
    c.first_name as `Musterinin adi`,
    c.last_name as `Musterinin soyadi`,
    count(o.id) as `Musterinin sifarislerinin sayi`
from customers c
left join orders o on c.id = o.customer_id 
group by c.id order by c.id asc;

-- kayitli ama siparisi olmayanlar

select 
	c.id as `Musterinin id-si`, 
    c.first_name as `Musterinin adi`,
    c.last_name as `Musterinin soyadi`
from customers c
left join orders o on c.id = o.customer_id 
where o.id is null order by c.id asc;


-- yeni bir table yaradarag datalari oraya klonlamaq

-- sadece schema klonlama datalar klonlanmir 
create table customers_test1 like customers;
-- datalar klonlarnir 
insert into customers_test1 select * from customers;

select * from customers_test1;

alter table customers_test1 add last_name2 varchar(255), add balance decimal(18, 2);
alter table customers_test1 modify last_name2 varchar(50);
alter table customers_test1 modify balance decimal(10, 2), add cins varchar(50) not null, drop last_name2;

select * from customers_test1;
update customers_test1 set cins = 'erkek';
update customers_test1 set cins = 'kadin' where id <= 10;


-- tasks 

-- butun productlarin qiymetine 5% artim elave olunsun                     # v
-- adi a ile baslayan butun customers lisdelenmesi                         # v
-- kateqiriyaya gore mehsularin sayinin lisdelenmesi                       # v
-- qiymeti 20 ve 30 arasinda olan butun productlarin lisdelenmesi      # v
create table products_test1 like products;
insert into products_test1 select * from products;
-- 1
select * from products_test1 where id = 1;
update products_test1 set list_price = list_price * 1.05;

-- 2
select * from customers_test1 where first_name like 'A%';

-- 3
select category, count(*) from products_test1 group by category; 

-- 4
select * from products_test1 where list_price between 20 and 30 order by list_price asc;

-- test adinda bir table yaradmaq ve strukturu employee den almaq                                             # v
-- test table employee table ilk 10 datasini elave elemek ve onlarin ilk 5-nin address istanbul elemek        # v
-- test ile employee tableleri eyni olan datalari listdeleme                                                  # v
-- istanbuldan xaricde yasiyan butun calisanlari listdeleme                                                   # v
-- adinin daxilinde 'an' olan butun calisanlari listdeleme
-- adinin ilk herifi n ve ya s olan calisanlari eyni listde yigmag

select * from test1;
select * from employees;
drop table test1;
-- 1 
create table test1 like employees;

-- 2
insert into test1 select * from employees order by id asc limit 11;
update test1 set city = 'Istanbul' where id between 1 and 5;

-- 3
select * from test1
union
select * from employees;

-- 4
select * from test1 where city != 'Istanbul';

-- 5
select * from test1 where first_name like '%an%';

-- 6
select * from test1 where first_name like 'n%' or first_name like 's%';

# string funksiyalari ve tasklar
 
select first_name, length(first_name)  as `adinin uzunlugu` from employees;
select concat(first_name, ' ', last_name) from employees;
select left(first_name, 2) from employees;
select right(first_name, 2) from employees;
select replace(first_name, 'a', ' change ') from employees;
select lower(first_name) from employees;
select upper(first_name) from employees;

-- test1 table full_name column elave elemek ve datalari first_name ve last_name ile doldurmaq       # v
-- test1 table first name ilk herf boyuk qalanlari kicik yazilsin
select * from test1;

-- 1
alter table test1 add full_name varchar(50);
update test1 set full_name = concat(first_name, ' ', last_name);

-- 2
update test1 set first_name = lower(first_name);      -- kiciltmek ucun
update test1 SET first_name = SUBSTRING_INDEX(email_address, '@', 1);
update test1 SET first_name = CONCAT(upper(SUBSTRING(first_name, 1, 1)), SUBSTRING(first_name, 2));




 