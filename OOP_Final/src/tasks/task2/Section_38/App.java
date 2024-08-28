package tasks.task2.Section_38;

import java.util.ArrayList;
import java.util.List;

import tasks.task2.Section_38.Business.CustomerManager;
import tasks.task2.Section_38.Core.Logers.BaseLogger;
import tasks.task2.Section_38.Core.Logers.ConsoleLogger;
import tasks.task2.Section_38.Core.Logers.DatabaseLogger;
import tasks.task2.Section_38.Core.Logers.FileLogger;
import tasks.task2.Section_38.Core.Logers.MailLogger;
import tasks.task2.Section_38.DataAccess.JdbcDataDao;
import tasks.task2.Section_38.Entity.Customer;

public class App {
    
    public static void main(String[] args) {

        Customer customer = new Customer("1", "test name", "test description", "example@gmail.com", 21);
        
        List<BaseLogger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        loggers.add(new ConsoleLogger());

        CustomerManager cutomerManager = new CustomerManager(loggers, new JdbcDataDao());
        cutomerManager.add(customer);

    }
}
