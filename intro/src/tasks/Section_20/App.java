package tasks.Section_20;

public class App {
    
    public static void main(String[] args) {
        
        char letter = 'E';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Qalin sesli herfdir");
                break;
            default: 
                System.out.println("Ince sesli herfdir");
        }
    }
}
