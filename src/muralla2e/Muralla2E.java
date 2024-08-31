package muralla2e;

import java.util.*;

public class Muralla2E {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Sales sell = new Sales();           
        Inputs input = new Inputs();
        
        int choice;
        
        do {
            System.out.println("1. Sales\n2. Grades\n3. Products");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            System.out.println("");
            
            switch (choice) {
                case 0:
                    break;
                case 1: 
                    sell.get_sales();
                    break;
                case 2:
                    input.getGrades();
                    break;
                case 3:
                    input.getProducts();
                    break;
                default:
                    System.out.println("????????\n");
                    break;
            }
            
            System.out.println("");          
        } while (choice != 0);
          
    }   
}
