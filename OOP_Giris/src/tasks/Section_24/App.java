package tasks.Section_24;

public class App {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[]{1, 5, 2, 6, 12, 82, 123, 43}; 
        int wantedNumber = 5;

        System.out.println(
            findNumber(numbers, wantedNumber)
        );
    }

    public static boolean findNumber(int[] numbers, int wantedNumber) {
        boolean result = false;

        for(int number : numbers) 
            if (number == wantedNumber)
                result = true;

        return result;
    }
}
