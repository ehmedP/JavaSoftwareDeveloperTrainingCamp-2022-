package AOP_Giris;

import AOP_Giris.CorporateCustomer.CorporateCustomer;
import AOP_Giris.IndividualCustomer.IndividualCustomer;
import AOP_Giris.Product.Product;

public class App {
    public static void main(String[] args) {
        
        String message = "Hello world";

        Product product1 = new Product();

        product1.setName("Kahve Makinesi 1");
        product1.setUnitPrice(7500.0);
        product1.setDiscount(7.0);
        product1.setUnitsInStock(3);
        product1.setImageUrl("anon1.jpg");

        // System.out.println(product1.name);

        Product product2 = new Product();

        product2.setName("Kahve Makinesi 2");
        product2.setUnitPrice(6500.0);
        product2.setDiscount(9.0);
        product2.setUnitsInStock(2);
        product2.setImageUrl("anon2.jpg");

        Product product3 = new Product();

        product3.setName("Kahve Makinesi 3");
        product3.setUnitPrice(4500.0);
        product3.setDiscount(3.0);
        product3.setUnitsInStock(4);
        product3.setImageUrl("anon3.jpg");

        Product[] products = {product1, product2, product3};

        for(Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        CorporateCustomer corporateCustomer = new CorporateCustomer();

        
    }
}
