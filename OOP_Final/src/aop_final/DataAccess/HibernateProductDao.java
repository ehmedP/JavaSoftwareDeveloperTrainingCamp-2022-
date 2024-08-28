package aop_final.DataAccess;

import aop_final.Entities.Product;

public class HibernateProductDao implements ProductDao {

    public void add(Product product) {
        System.out.println(product.getName() +" database Hibernate ile elave edildi.");
    }
}