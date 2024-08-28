package tasks.Section_19;

public class App {
    
    public static void main(String[] args) {
        
        int number = 25;

        if (number%2 != 0) 
            System.out.println(number +" reqemi tek reqemdir.");
        else 
            System.out.println(number +" reqemi cem reqemdir.");

        boolean isPrime = true;
        for(int i=2 ;i<number*number ;i++) 
            if (number%i == 0)
                isPrime = false;
        
        if(number < 2) 
            System.out.println("Reqem 2 den kicikdir.");
        else if(isPrime) 
            System.out.println(number +" reqemi sade ededdir");
        else
            System.out.println(number +" reqemi sade deyil");
    }
}
