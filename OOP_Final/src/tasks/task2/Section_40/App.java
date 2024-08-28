package tasks.task2.Section_40;

import tasks.task2.Section_40.GameCalculators.ChildGameCalculator;
import tasks.task2.Section_40.GameCalculators.ManGameCalculator;
import tasks.task2.Section_40.GameCalculators.WomanGameCalculator;

public class App {

    public static void main(String[] args) {
        
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        ChildGameCalculator childGameCalculator  = new ChildGameCalculator();

        manGameCalculator.hesabla();
        womanGameCalculator.hesabla();
        childGameCalculator.hesabla();
    }
    
}
