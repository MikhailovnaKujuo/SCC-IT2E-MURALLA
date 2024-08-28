package muralla2e;

import java.util.Scanner;

public class Grade {
    public void getGrades(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Number of Students: ");
        int scount = scan.nextInt();
        
        Grades[] gr = new Grades[scount];
        
        for (int i = 0; i < scount; i++){
            
            gr[i] = new Grades();
            
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
            
            gr[i].addGrades(name, id, p, m, pf, f);
            
        }
        System.out.println("");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "P", "M", "PF", "F", "Average", "Remarks");
        for (int i = 0; i < gr.length; i++){
            gr[i].viewGrades();
        }
        System.out.println("");
        
        System.out.println("No. of Students " + scount);
        int passed = 0, failed = 0;
        double totalAve = 0;
        
        for (int i = 0; i < gr.length; i++){
            totalAve += gr[i].average;
            if(gr[i].average < 3.0){
                passed++;
            }else{
                failed++;
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Total Class Average: %.2f\n", (totalAve / scount));
        System.out.println("No. of Passed: " + passed);
        System.out.println("No. of Failed: " + failed);
    }
}
