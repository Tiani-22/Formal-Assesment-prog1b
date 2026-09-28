/**
 * Abstract class that holds common data for all consoles
 */
public abstract class ConsoleSales implements IConsoleSales {
    // Variables - protected so child can use them
    protected String storeName;
    protected int totalSales;
    protected String consoleType;

    // Constructor - required for 4-5 marks
    public ConsoleSales(String storeName, String consoleType, int totalSales) {
        this.storeName = storeName;
        this.consoleType = consoleType;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method that child must implement
    @Override
    public abstract void displaySalesReport();
}