package aop_final.Core.Logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandi: "+ data);
    }
    
}
