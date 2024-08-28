package aop_final.Business;

import java.util.List;

import aop_final.Core.Logging.Logger;
import aop_final.DataAccess.ProductDao;
import aop_final.Entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.loggers = loggers;
        this.productDao = productDao;
    }
    
    public void add(Product product) throws Exception { 

        if (product.getUnitPrice() < 10) {
            throw new Exception("Mehsulun qiymeti 10-dan kicik ola bilmez.");
        } 

        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }

    }
}
