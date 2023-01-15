package class9;

import java.util.Scanner;

public class Task1 {
    public static void main (String[]args){

        /*
        create a program that will be asking user to apply for a credit card 10 times.
        as soon as you get a "yes" from a user program should stop asking.
         */

        Scanner scanner=new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Do you want to apply for credit card");
            String userInput=scanner.next();
        }
    }
}
