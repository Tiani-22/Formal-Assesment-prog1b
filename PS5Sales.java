public class PS5Sales extends ConsoleSales {

    // Constructor calls super - shows you understand inheritance
    public PS5Sales(String storeName, String consoleType, int totalSales) {
        super(storeName, consoleType, totalSales);
    }

    // Excellent implementation of abstract class
    @Override
    public void displaySalesReport() {
        System.out.println("**************************");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**************************");
        System.out.println("CONSOLE TYPE: " + consoleType);
        System.out.println("STORE: " + storeName);
        System.out.println("TOTAL SALES: " + totalSales);
    }
}