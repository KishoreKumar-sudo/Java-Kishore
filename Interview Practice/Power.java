import java.util.Scanner;

public class Power{

    public static void main(String[] args) {
        int x;
        double y,z;
        System.out.println("Enter any number: ");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = Math.pow(x, 2);
        z = Math.pow(x, 3);
        System.out.println("Square of "+x+":"+y);
        System.out.println("Cube of "+x+":"+z);
    }
}

/* O/P
 * Enter any number: 
10
Square of 10:100.0
Cube of 10:1000.0
 */