package tasks.task2.Section_41.Business;

import java.util.List;

import tasks.task2.Section_41.DatabaseManagers.BaseDatabaseManager;

public class CustomerManager {
    
    private List<BaseDatabaseManager> databaseManagerList;

    public CustomerManager() { };
    public CustomerManager(List<BaseDatabaseManager> databaseManagerList) {
        this.databaseManagerList = databaseManagerList;
    }

    public void add() {
        for (BaseDatabaseManager baseDatabaseManager : databaseManagerList) {
            baseDatabaseManager.add("data");
        }
    }

    public List<BaseDatabaseManager> getDatabaseManagerList() {
        return this.databaseManagerList;
    }

    public void setDatabaseManagerList(List<BaseDatabaseManager> databaseManagerList) {
        this.databaseManagerList = databaseManagerList;
    }

    
}
