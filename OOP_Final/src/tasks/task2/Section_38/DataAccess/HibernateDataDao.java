package tasks.task2.Section_38.DataAccess;

public class HibernateDataDao implements BaseDataDao {
    
    public void add(String data) {
        System.out.println(data +" hibernate ile database elave edildi.");
    }
}
