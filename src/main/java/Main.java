import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
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

        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name");
        String input = name.nextLine();
        if (input.equalsIgnoreCase("Alice")) {
            System.out.println("Hello Alice!");
        }
        else if (input.equalsIgnoreCase("Bob")) {
            System.out.println("Hello Bob!");
        }
        else{
            System.out.println();;
        }
    }
}
