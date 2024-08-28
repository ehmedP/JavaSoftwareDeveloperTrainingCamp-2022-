package tasks.Section_25;

public class App {
    
    public static void main(String[] args) {
        
        int[] arr = new int[]{1, 2, 3, 4, 5};

        showArray(arr);
        arrayReduce(arr);
        showArray(arr);
    }

    public static int arrayReduce(int[] array) {
        int total = 0;
        for (int item : array) 
            total += item;
        return total;
    }

    public static void showArray(int[] array) {
        for(int item : array) 
            System.out.println(item);
    }
}
