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
        
        Products[] pr = new Products[2];
        pr[0] = new Products();
        pr[1] = new Products();
        
        pr[0].addProducts(1001, "Kopiko", 13, 20, 3);
        pr[1].addProducts(1002, "Coke", 500, 0, 10);
        
        for (Products prod : pr) {
            prod.viewProducts();
        }  
        
    }   
}
