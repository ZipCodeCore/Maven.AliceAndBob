import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {


        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = in.nextLine();

        if(name.equalsIgnoreCase("Alice")) {
            System.out.println("Hello, " + name);
        }else if (name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello, " + name);
        }else {
            System.out.println("Bye, Felicia!");
        }
    }
}
