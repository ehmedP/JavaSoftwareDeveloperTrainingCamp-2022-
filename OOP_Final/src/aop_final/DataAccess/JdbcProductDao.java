package aop_final.DataAccess;

import aop_final.Entities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product) {
        System.out.println(product.getName() +" database JDBC ile elave edildi.");
    }
}