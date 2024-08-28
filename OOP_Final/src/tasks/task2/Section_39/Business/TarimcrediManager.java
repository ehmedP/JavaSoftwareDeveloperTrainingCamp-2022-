package tasks.task2.Section_39.Business;

public class TarimcrediManager extends BasecrediManager {
    
    @Override
    public Double hesabla(Double total) {
        return total * 1.13;
    }
}
