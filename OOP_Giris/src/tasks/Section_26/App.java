package tasks.Section_26;

// spread operator 
public class App {
    
    public static void main(String[] args) {
        
        System.out.println(
            sumReduce(1, 2, 3, 4, 5)
        );
    }

    public static int sumReduce(int... nums) {
        int total = 0;
        for (int item : nums) 
            total += item;
        return total;
    }
}
