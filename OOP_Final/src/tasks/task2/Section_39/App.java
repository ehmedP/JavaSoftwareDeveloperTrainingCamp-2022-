package tasks.task2.Section_39;

import java.util.ArrayList;
import java.util.List;

import tasks.task2.Section_39.Business.BasecrediManager;
import tasks.task2.Section_39.Business.OgrencicrediManager;
import tasks.task2.Section_39.Business.OgretmencrediManager;
import tasks.task2.Section_39.Business.TarimcrediManager;

public class App {
    
    public static void main(String[] args) {
        
        List<BasecrediManager> crediManagerList = new ArrayList<>();

        crediManagerList.add(new OgretmencrediManager());
        crediManagerList.add(new OgrencicrediManager());
        crediManagerList.add(new TarimcrediManager());

        for (BasecrediManager basecrediManager : crediManagerList) {
            System.out.println(basecrediManager.hesabla(1.0));
        }
    }
    
}
