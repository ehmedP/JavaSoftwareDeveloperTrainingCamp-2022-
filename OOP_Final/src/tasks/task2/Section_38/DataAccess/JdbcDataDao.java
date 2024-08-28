package tasks.task2.Section_38.DataAccess;

public class JdbcDataDao implements BaseDataDao {
    
    public void add(String data) {
        System.out.println(data +" jdbc ile database elave edildi.");
    }
}
