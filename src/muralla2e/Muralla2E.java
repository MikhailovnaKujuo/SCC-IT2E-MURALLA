package muralla2e;

import java.util.Scanner;

public class Muralla2E {

    public static void main(String[] args) {
        Sales sell = new Sales();    
//        sell.get_sales();

        Grades gr = new Grades();
        
//        gr.addGrades("Mike", 1001, 3.0, 2.0, 1.2, 1.7);
//        gr.viewGrades();
//        
        Products pr = new Products();
        Products pr1 = new Products();
        
        pr.addProducts(1001, "Kopiko", 13, 20, 3);
        pr1.addProducts(1002, "Coke", 500, 0, 10);
        pr.viewProducts();
        pr1.viewProducts();
        
    }
    
}
