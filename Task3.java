package class9;

import javafx.concurrent.ScheduledService;

import java.util.Scanner;

public class Task3 {
    public static void main (String[]args) {
        /*
        write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters monet accumulate the amount anf tell the user how much is left to pay off.
        if user give more money program should return a chance. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */

        // Break down this problem into 4 to 5 steps that we can write the code for and can test those interdependently.
        /*
        1)step ask user for item price and item name
        2) accumulate the price
        3) tell the use how much total that they should pay
        4)if user give more money program should return a change
        5) Thank you for shopping!

         */
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 3; i++) {


            System.out.println("Please enter the item and itd price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            total = total + itemPrice;
            System.out.println("This is the total amount that you have to pay" + total);
        }

        System.out.println("PLease pay for the items");
        double amountPaid = scanner.nextDouble();

        if (amountPaid > total) {
            double change = amountPaid - total;
            System.out.println("Hey here is your change" + change);
        }
        System.out.println("Thank you for shopping");

    }

    }




