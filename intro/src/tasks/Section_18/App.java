package tasks.Section_18;

public class App {
    
    public static void main(String[] args) {
        
        String message = "The weather is beautiful today.";

        System.out.println(message.replace(" ", "-"));
        System.out.println(message.indexOf("T"));
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.substring(4, 11));
        
        for (String word : message.split(" ")) 
            System.out.println(word);
        
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

    }
}
