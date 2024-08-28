package tasks.Section_33;

import tasks.Section_33.Product.Product;
import tasks.Section_33.ProductManager.ProductManager;

public class App {
    
    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.setName("Computer");
        product1.setId(1);
        product1.setDescription("Asus Computer");
        product1.setPrice(5500.0);
        product1.setStockAmount(3);
        product1.setColor("blue");
        product1.setCode("#294224");

        Product product2 = new Product(1, "Computer 2", "Asus Computer", 2900.0, 4, "black", "#33452");

        ProductManager productManager = new ProductManager();
        
        productManager.add(product1); 
        productManager.add(product2);
    }
}
