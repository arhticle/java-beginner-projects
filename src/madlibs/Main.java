package madlibs;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // madlibs beginner project game.

        Scanner scanner = new Scanner(System.in);

        // declaring all variables used for the game.

        String noun1;
        String adjective1;
        int age1;
        String adjective2;
        double GPA;
        String car1;
        double price1;
        String verb1;
        String adjective3;
        String adjective4;


        // asking user to input their answer for the specific section of the game.

        System.out.println("Hello! Welcome to the MadLibs game!\n");

        System.out.print("Please input your first noun (person/place): ");
        noun1 = scanner.nextLine();
        System.out.print("Please input your first adjective (describing something): ");
        adjective1 = scanner.nextLine();
        System.out.print("Please input your age: ");
        age1 = scanner.nextInt();
        scanner.nextLine(); // added this to avoid common issue with overlapping i/o.
        System.out.print("Please input your second adjective (describing something): ");
        adjective2 = scanner.nextLine();
        System.out.print("Please input your GPA (grade): ");
        GPA = scanner.nextDouble();
        scanner.nextLine(); // added again to avoid issue with overlapping i/o.
        System.out.print("Please input your car choice: ");
        car1 = scanner.nextLine();
        System.out.print("Please input your price choice (£): ");
        price1 = scanner.nextDouble();
        scanner.nextLine(); // added again to avoid issue with overlapping i/o.
        System.out.print("Please input your first verb (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Please input your third adjective (describing something): ");
        adjective3 = scanner.nextLine();
        System.out.print("Please input your fourth adjective (describing something): ");
        adjective4 = scanner.nextLine();


        // the main output of the game after user input has been received.

        System.out.println("\nToday I went to a " + noun1 + "!");
        System.out.println("Inside this " + noun1 + " I " + adjective1 + " found something interesting.");
        System.out.println("There, I was asked to input my age which was " + age1 + ".");
        System.out.println("The place was acting very " + adjective2 + "...");
        System.out.println("After several seconds I got asked for my... GPA?! So I said " + GPA + "!");
        System.out.println("Then, I got asked for my favourite car choice, which was " + car1 + ".");
        System.out.println("After I got asked for my desired price, which I said " + price1 + "!");
        System.out.println("At the end, it calculated my results, I " + verb1 + "very " + adjective3 + ".");
        System.out.println("Finally, their result told me I was " + adjective4 + "!" + " Can you believe it?");


        scanner.close();

    }
}
