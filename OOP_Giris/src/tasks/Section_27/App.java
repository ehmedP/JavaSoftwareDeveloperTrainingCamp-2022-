package tasks.Section_27;

import tasks.Section_27.CustomerManager.CustomerManager;

public class App {
    
    public static void main(String[] args) {
        
        CustomerManager customerManager = new CustomerManager();

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}
