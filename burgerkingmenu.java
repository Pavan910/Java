import java.util.Scanner;

public class burgerkingmenu {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        for (;;) {
            System.out.println("  WELCOME TO BURGER KING ");
            System.out.println("\t MENU");
            System.out.println("1. 1 veg burger + 1 coke - 100Rs.");
            System.out.println("2. 1 veg burger + fries + coke - 150Rs.");
            System.out.println("3. 1 veg burger - 30Rs. \n");
            System.out.println("Choose a number to place your order");
            int n = menu.nextInt();
            System.out.println("enter the number of item to order");
            int s = menu.nextInt();
            if (n == 1) {
                int total = s * 100;
                System.out.println("you order '1 veg burger and 1 coke' has been placed");
                System.out.println("your total amount is Rs " + total);
                System.out.println(" \t Thank You visiting BURGER KING \t");
            } else if (n == 2) {
                int total = s * 150;
                System.out.println("you order '1 veg burger,fires and coke' has been placed");
                System.out.println("your total amount is Rs " + total);
                System.out.println("\t Thank You visiting BURGER KING \t");
            } else {
                int total = s * 30;
                System.out.println("you order '1 veg burger' has been placed");
                System.out.println("your total amount is Rs " + total);
                System.out.println("\t Thank You visiting BURGER KING \t");
            }
        }
    }

}
