package tasks.task2.Section_45.ProductManager;

import tasks.task2.Section_45.Product.Product;
import tasks.task2.Section_45.ProductValidator.ProductValidator;

public class ProductManager {

    public void add(Product product) {

        if (ProductValidator.isValid(product))
            System.out.println(product.getName() +" database elave edildi.");
        else 
            System.out.println("Melumatlarda yanlislig var");

    }
    
}
