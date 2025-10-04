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

        System.out.println("Please input your first noun (person/place): ");
        System.out.println("Please input your first adjective (describing something): ");
        System.out.println("Please input your first adjective (describing something): ");
        System.out.println("Please input your first adjective (describing something): ");
        System.out.println("Please input your first adjective (describing something): ");
        System.out.println("Please input your first adjective (describing something): ");
        System.out.println("Please input your first adjective (describing something): ");
        System.out.println("Please input your first adjective (describing something): ");



        // the main output of the game after user input has been received.

        System.out.println("Today I went to a " + noun1 + "!");
        System.out.println("Inside this " + noun1 + " I " + adjective1 + " found something interesting.");
        System.out.println("There, I was asked to input my age which was " + age1 + ".");
        System.out.println("The place was acting very" + adjective2 + "...");
        System.out.println("After several seconds I got asked for my... GPA?! So I input " + GPA + "!");
        System.out.println("After several seconds, I got asked for my favourite car choice, which was " + car1 + ".");
        System.out.println("Then asked for my desired price, which I said ") + price1 + "!";
        System.out.println("At the end, it calculated my results, I " + verb1 + "very " + adjective3 + ".");
        System.out.println("Finally, their result told me I was " + adjective 4 + "!" + " Can you believe it?");




        scanner.close();

    }
}
