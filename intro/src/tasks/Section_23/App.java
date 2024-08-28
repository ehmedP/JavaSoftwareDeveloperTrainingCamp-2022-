package tasks.Section_23;

public class App {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int wanted = 5;

        boolean result = false;
        for (int num : numbers) 
            if (num == wanted)
                result = true;
            
        System.out.println(result);
    }
}
