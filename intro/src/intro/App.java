package intro;

public class App {

    public static void main(String[] args) {

        // System.out.println("Hello world!!");

        // variables define in java (camelCase)
        String middleText = "Ilginizi ceke bilir";
        String bottomText = "Vade suresi";

        System.out.println(middleText);

        // integer
        int num1 = 15;

        // decimal 
        double num2 = 18.14;
        // float num3 =  18.1;

        // boolean 

        boolean ready = false || true;

        Integer a = 5, b = 15;

        if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("=");
        } else {
            System.out.println(">");
        }

        String[] array = {"data1", "data2", "data3", "data4"};

        for (String item : array) {
            System.out.println(item);
        }

    }
}
