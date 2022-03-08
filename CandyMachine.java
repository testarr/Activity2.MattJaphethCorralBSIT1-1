package MattCandyMachine;
import java.util.Scanner;
public class CandyMachine {

  public static void main(String[] args) {
   Scanner ft = new Scanner (System.in);
        
        
        System.out.println("Debit Card Received!");
        System.out.println(" ");
        System.out.println("Available Products: Candies, Chips, Gums, and Cookies.");
        System.out.println(" ");
        
        System.out.println("Enter 1 for candies.");
        System.out.println("Enter 2 for chips.");
        System.out.println("Enter 3 for gums.");
        System.out.println("Enter 4 for cookies.");
        System.out.println(" ");
        
        
        int pr = ft.nextInt();
        int A1 = pr;
        System.out.println(" ");
        
        if (A1 == 1)
        {
            System.out.println("Candies are sold 3 pieces for 5 pesos.");
            System.out.println("Enter 1 to purchase or 2 to end.");
            int candy1 = ft.nextInt();
            if (candy1 == 1)
            System.out.println("Thank you for your purchasal, product/s has been dropped under the machine's vent.");
            else
            System.out.println("Come again!");
        }
        else if (A1 == 2)
        {
            System.out.println("Chips are sold 2 for 30 pesos.");
            System.out.println("Enter 1 to purchase or 2 to end.");
            int chips1 = ft.nextInt();
            if (chips1 == 1)
            System.out.println("Thank you for your purchasal, product/s has been dropped under the machine's vent.");
            else
            System.out.println("Come again!");
        }
        else if (A1 == 3)
        {
            System.out.println("Gums are sold 2 pieces for 6 pesos");
            System.out.println("Enter 1 to purchase or 2 to end.");
            int gums1 = ft.nextInt();
            if (gums1 == 1)
            System.out.println("Thank you for your purchasal, product/s has been dropped under the machine's vent.");
            else
            System.out.println("Come again!");
        }
        else if (A1 == 4)
        {
            System.out.println("Cookies are sold 1 pack for 15 pesos");
            System.out.println("Enter 1 to purchase or 2 to end.");
            int cookies1 = ft.nextInt();
            if (cookies1 == 1)
            System.out.println("Thank you for your purchasal, product/s has been dropped under the machine's vent.");
            else
            System.out.println("Come again!");
        }
  }
}
