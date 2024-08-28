package tasks.Section_21;

public class App {
    
    public static void main(String[] args) {
        
        int number = 26, total = 0;

        for(int i=1 ;i<=number ;i++) 
            if(number%i == 0)
                total += i;
        if (total == number)
            System.out.println(number +" mukemmel sayidir");
        else
            System.out.println(number +" mukemmel sayi deyil");
    }
}
