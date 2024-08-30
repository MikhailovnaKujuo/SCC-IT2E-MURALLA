package muralla2e;

import java.util.Scanner;

public class Inputs {
    
    Scanner scan = new Scanner(System.in);
    
    public void getProducts(){
        
        System.out.print("Enter Number of Products: ");
        int np = scan.nextInt();
        
        Products[] pr = new Products[np];
        
        for (int i = 0; i < np; i++){
                       
            System.out.println("\nEnter Details for Product " + (i + 1));
            System.out.print("ID: ");
            int id = scan.nextInt();
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            System.out.print("Stocks: ");
            int stocks = scan.nextInt();
            System.out.print("Sold: ");
            int sold = scan.nextInt();
            System.out.println("");
            
            pr[i] = new Products(id, name, price, stocks, sold);
        }
        double totalProfit = 0, totalTep = 0;
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "TEP", "Status");
        for (Products pr1 : pr) {
            pr1.viewProducts();
            totalProfit += pr1.profit;
            totalTep += pr1.tep;
        }  
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.printf("Total Profits: %.2f\n", totalProfit);
        System.out.printf("Total Estimate Price: %.2f\n", totalTep);
        
    }
    
    public void getGrades(){
        
        System.out.print("Enter Number of Students: ");
        int scount = scan.nextInt();
        
        Grades[] gr = new Grades[scount];
        
        for (int i = 0; i < scount; i++){
                                  
            System.out.println("\nEnter Details of Student " + (i + 1));
            System.out.print("ID: ");
            int id = scan.nextInt();
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Prelim: ");
            double p = scan.nextDouble();
            System.out.print("Midterm: ");
            double m = scan.nextDouble();
            System.out.print("Pre-final: ");
            double pf = scan.nextDouble();
            System.out.print("Final: ");
            double f = scan.nextDouble();
            
            gr[i] = new Grades(name, id, p, m, pf, f);
          
        }
        System.out.println("");
        
        int passed = 0, failed = 0;
        double totalAve = 0;
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "P", "M", "PF", "F", "Average", "Remarks");
        for (Grades gr1 : gr) {
            gr1.viewGrades();
            
            totalAve += gr1.average;
            if (gr1.average < 3.0) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("No. of Students " + scount);
        System.out.printf("Total Class Average: %.2f\n", (totalAve / scount));
        System.out.println("No. of Passed: " + passed);
        System.out.println("No. of Failed: " + failed);
    }
}
