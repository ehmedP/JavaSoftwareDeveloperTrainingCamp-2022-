package tasks.Section_37;

import tasks.Section_37.AskercrediManager.AskercrediManager;
import tasks.Section_37.TeachercrediManager.OgretmencrediManager;

public class App {
    
    public static void main(String[] args) {
        
        AskercrediManager askercrediManager = new AskercrediManager();
        OgretmencrediManager ogretmencrediManager = new OgretmencrediManager();

        askercrediManager.Hesabla();
        ogretmencrediManager.Hesabla();
    }
}
