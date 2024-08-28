package tasks.Section_31;

import tasks.Section_31.Product.Product;
import tasks.Section_31.ProductManager.ProductManager;

public class App {
    
    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.name = "Computer";
        product1.id = 1;
        product1.description = "Asus Computer";
        product1.price = 5500.0;
        product1.stockAmount = 3;

        ProductManager productManager = new ProductManager();

        productManager.add(product1); 

    }
}
