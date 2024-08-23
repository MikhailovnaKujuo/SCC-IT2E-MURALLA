
package muralla2e;

public class Grades {
    String name;
    int id;
    double p, m, pf, f;
    
    public void addGrades(String name, int id, double p, double m, double pf, double f){
        this.id = id;
        this.name = name;
        this.p = p;
        this.m = m;
        this.pf = pf; 
        this.f = f;
    }
    
    public void viewGrades(){
        double average = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
    }
}