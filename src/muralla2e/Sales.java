package muralla2e;

import java.util.Scanner;


public class Sales {
    public void get_sales(){
        Scanner input = new Scanner(System.in);
        
        String name, product_name;
        float qty, price, cash, total;
        
        System.out.print("Enter Customer Name: ");
        name = input.nextLine();
        System.out.print("Enter Product Name: ");
        product_name = input.nextLine();
        System.out.print("Enter Quantity: ");
        qty = input.nextFloat();
        System.out.print("Enter Price: ");
        price = input.nextFloat();
        System.out.print("Enter Cash: ");
        cash = input.nextFloat();
        
        total = price * qty;
        
        System.out.println("--------------------------------");
        System.out.println("\tRECEIPT");
        System.out.println("--------------------------------");
        
        System.out.println("Name: " + name);
        System.out.println("\nItem Name: " + product_name);
        System.out.println(String.format("Quantity: %.0f", qty));
        System.out.println("--------------------------------");
        
        System.out.println(String.format("Total Due: %.2f", total));
        System.out.println(String.format("Cash: %.2f", cash));
        System.out.println("--------------------------------");
        System.out.println(String.format("Change: %.2f", (cash - total)));
    }
}
