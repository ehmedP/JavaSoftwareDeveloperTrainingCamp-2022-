package aop_final;

import java.util.ArrayList;
import java.util.List;

import aop_final.Business.ProductManager;

import aop_final.Core.Logging.DatabaseLogger;
import aop_final.Core.Logging.FileLogger;
import aop_final.Core.Logging.Logger;
import aop_final.Core.Logging.MailLogger;

import aop_final.DataAccess.HibernateProductDao;
import aop_final.DataAccess.JdbcProductDao;
import aop_final.Entities.Product;

public class App {

    public static void main(String[] args) throws Exception {

        Product product = new Product(1, "Iphone", 10000.0);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());
        loggers.add(new FileLogger());

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers); // datanin alternativi
        productManager.add(product);
    }
}
