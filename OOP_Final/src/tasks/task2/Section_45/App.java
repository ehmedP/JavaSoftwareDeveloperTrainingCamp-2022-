package tasks.task2.Section_45;

import tasks.task2.Section_45.Product.Product;
import tasks.task2.Section_45.ProductManager.ProductManager;

public class App {
    
    public static void main(String[] args) {
        
        Product product = new Product(1, "product1", "product1 description", 22.0);
        ProductManager productManager = new ProductManager();

        productManager.add(product);

    }
}
