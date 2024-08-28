package tasks.task2.Section_38.Business;

import java.util.List;
import tasks.task2.Section_38.Core.Logers.BaseLogger;
import tasks.task2.Section_38.DataAccess.BaseDataDao;
import tasks.task2.Section_38.Entity.Customer;

public class CustomerManager {

    private List<BaseLogger> loggers;
    private BaseDataDao dataDao;

    public CustomerManager(List<BaseLogger> loggers, BaseDataDao dataDao) {
        this.loggers = loggers;
        this.dataDao = dataDao;
    }

    public void add(Customer customer) {
        dataDao.add(customer.getName());

        for(BaseLogger logger : this.loggers) {
            logger.log(customer.getName());
        }
    }

}
