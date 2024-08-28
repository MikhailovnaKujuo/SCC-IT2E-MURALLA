package muralla2e;

import java.util.*;

public class Muralla2E {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Sales sell = new Sales();    
//        sell.get_sales();

//        Grades[] gr = new Grades[2];
//        gr[0] = new Grades();
//        gr[1] = new Grades();
//        
//        gr[0].addGrades("Mike", 1001, 1.0, 2.0, 1.5, 1.2);
//        gr[1].addGrades("Dum ahh", 1002, 3.5, 3.0, 3.4, 2.8);
//        
//        for (Grades grade : gr) {
//            grade.viewGrades();
//        }
        
        System.out.print("Enter Number of Products: ");
        int np = scan.nextInt();
        
        Products[] pr = new Products[np];
        
        for (int i = 0; i < np; i++){
            pr[i] = new Products();
            
            System.out.println("Enter Details for Product " + (i + 1));
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
            
            pr[i].addProducts(id, name, price, stocks, sold);
        }
        
        for (int i = 0; i < pr.length; i++) {
            pr[i].viewProducts();
        }  
        
    }   
}
