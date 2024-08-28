package tasks.Section_15;

public class App {
    
    public static void main(String[] args) {
        
        double[] list = {1.2, 4.5, 2.1, 6.2, 1.3};
        double total = 0, max = list[0];

        for (double item : list) {
            total += item;
            if(max < item) max = item;
        }

        System.out.println("Listdeki en boyuk reqem: "+ max);
        System.out.println("Listdeki butun reqemlerin cemi: "+ total);

    }
}
