//*
* Number 1 Electronics - Gaming Con sole Report
*Uses single and two-dimemsional arrays tp display yearly sales
*/

public class GamingConsoleReport {
    public static void main(String[] args )
}
        //Single dimensional arrays - city names and console types 
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoleTypes = {"PS5", "XBOX", "SWITCH"};
        
        //Two-dimensional arrays - sales data[city][console]
        int[][] yearlySales = {{1000, 2000, 3000}, //Cape town 
                               {2000, 3000, 4000}, //Port Elizabeth 
                               {1500,1100,1200}}; //Pretoria 
                               
        //Array to store total sales per city 
        int[] totalSalesPerCity = new int[cities.length];
        displaySalesReport(cities, consoleTypes, yearlySales);
        calculateTotalSales(yearlySales, totalSalesPerCity);
        displayTotalsAndMaxCity(cities, totalSalesPerCity);
        
     //Display the main gaming console report 
        public static void displaySalesReport(String[] cities, String[] consoleTypes, int[][] yearlySales) {
            System.out.print("---------------------------------------------------------------------------------------");
            System.out.print("GAMING CONSOLE Report");
            
        System.out.print("%-20s %-10s %-10s %-10s\n", "", consoleTypes[0], consoleTypes[1], consoleTypes[2]);
        
        for (int i = 0; i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i], yearlySales[i][0], yearlySales[i][1], yearlySales[i][2] }
            
            
            System.out.println("------------------------")
        }
        
        //Calculate total sales for each city
        public static void calculateTotalSales(imt[][] yearlySales, int[] totalSalesPerCity) {
            for (int i= 0; i < yearlySales.length; i++) {
                int cityTotal = 0;
                for (int j = 0; j < yearlySales.length; i++) {
                    cityTotal += yearlySales[i][j];
                }
                totalSalesPerCity[i] = cityTotal;
            }
        }
        
        //Display totals and finds city with most sales
        public static void displayTotalsAndMaxCity(String[] cities, int[] totalSalesPerCity) {
            System.out.println("CONSOLE SALES TOTALD FOR EACH CITY");
            System.out.println("-----------------------------------------------------------------------------------");
            int maxSales = totalSalesPerCity[0];
            int maxCityIndex = 0;
            
            for (int i = 0; i < cities.length; i++) {
                System.out.printf("%-20s %d\n", cities[i], totalSalesPerCity[i]);
                
                //Track cicty with most sales 
                if (totalSalesPerCity[i] > maxSales) {
                    maxSales = totalSalesPerCity[i];
                    maxCityIndex = i;
                }
            }
            System.out.println();
            System.out.println("CITY WITH THE MOST SALES: " + cities[maxCityIndex]);
            
            System.out.println("----------------------------------------------------------------------------------");
        }
    }
        
        