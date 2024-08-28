package tasks.Section_14;

public class App {
    
    public static void main(String[] args) {
        
        String[] students = new String[4];
        students[0] = "ogr1";
        students[1] = "ogr2";
        students[2] = "ogr3";
        students[3] = "ogr4";

        for(int i=0 ;i<students.length ; i++) 
            System.out.println(students[i]);
        
        for (String student : students) {
            System.out.println(student);
        }

        
    }
}
