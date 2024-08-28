package tasks.task2.Section_45.ProductValidator;

import tasks.task2.Section_45.Product.Product;

public class ProductValidator {
    
    public static Boolean isValid(Product product) {
        if (!product.getName().isEmpty() && product.getPrice() > 0)
            return true;
        else 
            return false;
    }
}
