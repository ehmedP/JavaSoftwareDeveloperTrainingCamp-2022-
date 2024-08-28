package tasks.Section_16;

public class App {
    
    public static void main(String[] args) {
        
        String[][] regions = new String[3][3];

        regions[0][0] = "Istanbul";
        regions[0][1] = "Bursa";
        regions[0][2] = "Bilecik";
        regions[1][0] = "Adana";
        regions[1][1] = "Konya";
        regions[1][2] = "Ankara";
        regions[2][0] = "Izmir";
        regions[2][1] = "Gaziantep";
        regions[2][2] = "Kayseri";

        for (String[] row : regions) {
            System.out.println("-----------------------------------+");
            for (String column : row) {
                System.out.println("Region name: "+ column);
            }
        }
    }
}
