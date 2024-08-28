package tasks.Section_9;

// find max number
public class App {
    
    public static void main(String[] args) {
        
        int num1 = 25, num2 = 12, num3 = 32, maxNum = num1;

        if (maxNum < num2) maxNum = num2;
        if (maxNum < num3) maxNum = num3;

        System.out.println(maxNum);
    }
}
