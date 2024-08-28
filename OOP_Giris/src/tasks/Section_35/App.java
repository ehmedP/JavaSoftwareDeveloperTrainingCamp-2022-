package tasks.Section_35;

import tasks.Section_35.FourOperation.FourOperation;

public class App {
    
    public static void main(String[] args) {
        
        FourOperation fourOperation = new FourOperation();

        System.out.println(
            fourOperation.add(1, 2) +"\n"+
            fourOperation.add(1, 2, 3)
        );
    }
}
