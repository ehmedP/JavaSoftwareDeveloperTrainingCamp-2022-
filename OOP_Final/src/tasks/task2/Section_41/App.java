package tasks.task2.Section_41;

import java.util.ArrayList;
import java.util.List;

import tasks.task2.Section_41.Business.CustomerManager;
import tasks.task2.Section_41.DatabaseManagers.BaseDatabaseManager;
import tasks.task2.Section_41.DatabaseManagers.MySQLDatabaseManager;
// import tasks.task2.Section_41.DatabaseManagers.OracleDatabaseManager;

public class App {
    
    public static void main(String[] args) {
        
        CustomerManager customerManager = new CustomerManager();

        List<BaseDatabaseManager> databaseManagerList = new ArrayList<>();

        databaseManagerList.add(new MySQLDatabaseManager());
        // databaseManagerList.add(new OracleDatabaseManager());

        customerManager.setDatabaseManagerList(databaseManagerList);

        customerManager.add();
    }
}
