package tasks.task2.Section_39.Business;

public class OgretmencrediManager extends BasecrediManager {
    
    @Override
    public Double hesabla(Double total) {
        return total * 1.10;
    }
}
