package aop_final.Core.Logging;

public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Mail adresine loglandi: "+ data);
    }
    
}