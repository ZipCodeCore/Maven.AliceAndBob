/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

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


        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob"))
        {
            System.out.println("Hello " + name);
        }

        }
    }

