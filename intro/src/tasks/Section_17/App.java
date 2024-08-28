package tasks.Section_17;

public class App {
    
    public static void main(String[] args) {
        
        String message = "The weather is beautiful today.";

        System.out.println(message);

        System.out.println("Mesajin 5-ci indeksi: "+ message.charAt(4));
        System.out.println(message.concat(" Hooray."));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("T"));
        
    }
}
