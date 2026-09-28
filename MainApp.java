import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("\n");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume enter

        String selectedType = "";
        switch(choice) {
            case 1: selectedType = "PS5"; break;
            case 2: selectedType = "XBOX"; break;
            case 3: selectedType = "SWITCH"; break;
            default: selectedType = "PS5";
        }

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + selectedType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Use the class that extends abstract class
        ConsoleSales salesReport = new PS5Sales(storeName, selectedType, totalSales);
        salesReport.displaySalesReport();

        scanner.close();
    }
}