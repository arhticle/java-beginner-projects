package shoppingcartprogram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // shopping cart program beginner project.
        Scanner scanner = new Scanner(System.in);


        // declaring variables for the program.
        String item;
        double price;
        int quantity;
        char currency = '£';
        double total;


        // asking user for inputs for their shopping cart.
        System.out.print("Please type the name of the item you would like to purchase: ");
        item = scanner.nextLine();
        System.out.print("What is the price of this item?: ");
        price = scanner.nextDouble();
        System.out.print("How much of this item would you like to buy?: ");
        quantity = scanner.nextInt();


        // thank you message
        System.out.println("\nThank you.");


        // calculation on how to work out the total.
        total = price * quantity;


        // output based on what the user gave + logic code.
        System.out.println("You have chosen " + quantity + " " + item + "/s.");
        System.out.println("Your total is " + currency + total + "!");
        System.out.println("\nThank you for using our program.");


        // end of program code.
        scanner.close();


    }
}
