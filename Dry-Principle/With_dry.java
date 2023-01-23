
// Importing input output classes
import java.util.*;

// Main class
public class With_dry {

    // Method 1
    // For Mech department
    public void MECH() {

        // Print statement
        System.out.println("This is Fire-Mech");

        // Calling method
        college();
    }

    // Method 2
    // For ece dept method
    public void ECE() {
        System.out.println("This is Electronics");

        // Calling method
        college();
    }

    // Method 3
    // For AutoMobile dept
    public void AutoMobile() {

        // Print statement
        System.out.println(
                "This is AutoMobile");

        // Callling method
        college();
    }

    // Method 4
    // For college dept
    public void college() {

        // Print statement
        System.out.println("Anna University - Chennai");
    }

    // Method 5
    // Main driver method
    public static void main(String[] args) {

        // Creating object of class in main() method
        With_dry d = new With_dry();

        // Calling the methods one by one
        // as created above
        d.MECH();
        d.ECE();
        d.AutoMobile();
    }
}