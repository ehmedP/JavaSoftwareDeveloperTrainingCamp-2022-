package tasks.task2.Section_38.Core.Logers;

public class ConsoleLogger implements BaseLogger {
    public void log(String data) {
        System.out.println(data +" ConsoleLogger ile loglandi");
    }
}
