package muralla2e;

import java.util.Scanner;

public class Muralla2E {

    public static void main(String[] args) {
        Sales sell = new Sales();    
//        sell.get_sales();

        Grades gr = new Grades();
        
        gr.addGrades("Mike", 1001, 3.0, 2.0, 1.2, 1.7);
        gr.viewGrades();
    }
    
}
