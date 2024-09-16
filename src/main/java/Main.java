/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        // create a new object of class Main

        // call the compute() method on that new object
    }

    public void compute() {
        // Get input string of name from user
        
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.print("Please enter your name: ");
            input = scanner.nextLine();

            if (input.equals("Alice")) {
                System.out.println("Hello Alice");
                break;
            } else if (input.equals("Bob")) {
                System.out.println("Hello Bob");
                break;
            } else {
                System.out.println("Your name is not \"Alice\" or \"Bob.\" Please try again.");
            }

        } while (!input.equals("Alice") && !input.equals("Bob"));

    }
}
