
use sakila;

select 
	cst.customer_id as `ID`, 
    cst.first_name as `First name`, 
    cst.last_name as `Last name`,
    adr.address as `Birinci address`, 
    adr.address2 as `Ikinci address`,
    cty.city as `Seher`
from customer cst 
inner join address adr on 
	adr.address_id = cst.address_id
inner join city cty on 
	cty.city_id = adr.city_id
order by cst.first_name;



select cst.*, adr.* from customer cst, address adr where cst.address_id = adr.address_id;

select cst.*, adr.* from customer cst 
inner join address adr on 
	adr.address_id = cst.address_id;
    
    
--  her isdifadecinin nece address-i var

select cst.first_name ,count(adr.address_id) from customer cst
inner join address adr on 
	adr.address_id = cst.address_id
group by cst.customer_id;

-- seherlere gore isdifadeci saylari

select 
	cty.city as `Seher adlari`,
    count(cst.customer_id) as `Seherdeki customerlerin sayi`
from customer cst inner join address adr on  
	cst.address_id = adr.address_id 
inner join city cty on 
	cty.city_id = adr.city_id
group by cty.city 
order by count(cst.customer_id) desc;

-- kac tane erkek ve kac tane kadin kullanici var

select gender as 'Cins', count(cst.customer_id) as 'Sayi' from customer cst group by gender;

-- en cox alis sayisi olan customer

select 
	cst.id as 'Customerin id-si',
	cst.first_name as 'Customerin adi', 
    cst.last_name as 'Customerin soyadi', 
    sum(ord_det.quantity) as 'Aldigi mehsullarin umumi sayi'
from orders ord
inner join customers cst on
	ord.customer_id = cst.id
inner join order_details ord_det on
	ord_det.order_id = ord.id
group by ord.customer_id
order by sum(ord_det.quantity) desc
limit 1;

-- en cox gelir getiren ilk 10 mehsul ve neqeder gelir getirmisdir

select 
	ord_det.product_id as 'Mehsulun id-si',
    prd.product_name as 'Mehsulun adi',
    sum(ord_det.quantity) as 'Mehsuldan nece eded satilmisdir',
    ord_det.unit_price as 'Mehsulun 1 ededinin deyeri',
    sum(ord_det.unit_price * ord_det.quantity) as 'Mehsul ucun toplam gelir'
from orders ord
inner join order_details ord_det on
	ord_det.order_id = ord.id
inner join products prd on
	prd.id = ord_det.product_id
group by ord_det.product_id
order by sum(ord_det.quantity) desc
limit 10;

-- select * from order_details ord_det inner join products prd on prd.id = ord_det.product_id where prd.id = 48;

-- order_details cedvelinden ilk 40 setirden sonra ilk 15 setir 

select * from order_details where id between 41 and 55 order by id;
select * from order_details where id > 40 limit 15;

-- ay ve ile gore sifarislerin umumi sayi

select year(order_date) as 'Il', count(id) as 'Il daxilinde satislarin sayi' from orders group by year(order_date);
select order_date as 'Tam tarix' ,month(order_date) as 'Ay', count(id) as 'Ay daxilinde verilen sifarislerin sayi' from orders group by month(order_date);
-- sadece 03 ayli tarixde verilen sifarislerin sayi

select * from orders where month(order_date) = 3;

-- mehsullarin min ve max tutarlari ile birlikde en cok satis olunan ay

select 
	prd.product_name as 'Mehsulun adi',
    (select min(ord_det.unit_price) from order_details ord_det where ord_det.product_id = prd.id) as 'Mehsulun minimum qiymeti',
    (select max(ord_det.unit_price) from order_details ord_det  where ord_det.product_id = prd.id) as 'Mehsulun maximum qiymeti'
from products prd;

-- mehsulun qiymeti 20 den boyukdurse expensive 10 kicikdirse chip ve araligindadirsa normal
select distinct
	prd.id as 'Mehsul id', 
    prd.product_name as 'Mehsulun adi',
    case
		when unit_price <= 10 then 'Ucuz' 
		when unit_price between 11 and 19 then 'Normal'  
		when unit_price >= 20 then 'Expensive'
	end as 'Qiymet'
from order_details ord_det
inner join products prd on 
	prd.id = ord_det.product_id
order by prd.id;

-- explain acar sozu sql sorgunu yaparken calisma planini ve nece setir ve sutun oxugunu oyrenmek icin acar soz
explain select * from customers where first_name='Anna';

SET profiling = 1;
select * from customers where first_name='Anna';
SHOW PROFILES;
SHOW PROFILE FOR QUERY 1;

