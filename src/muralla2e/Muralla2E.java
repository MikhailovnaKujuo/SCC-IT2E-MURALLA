package muralla2e;

import java.util.*;

public class Muralla2E {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Sales sell = new Sales();           
        Product pr = new Product();
        Grade gr = new Grade();
        Account acc = new Account();
        
        int choice;
        
        System.out.println("1. Sales\n2. Grades\n3. Products\n4. Accounts");
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
                gr.getGrades();
                break;
            case 3:
                pr.getProducts();
                break;
            case 4:
                acc.getAccount();
                break;
            default:
                System.out.println("????????\n");
                break;
        }         
    }   
}
