package tasks.Section_30;

import tasks.Section_30.FourOperators.FourOperators;

public class App {
    
    public static void main(String[] args) {
        
        FourOperators fourOperators = new FourOperators();

        System.out.println(
            fourOperators.add(1.0, 2.0) +"\n"+
            fourOperators.multiply(1.0, 2.0) +"\n"+
            fourOperators.subtract(1.0, 2.0) +"\n"+
            fourOperators.divide(1.0, 2.0)
        );
    }
}
