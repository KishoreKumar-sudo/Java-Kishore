import java.util.Scanner;

public class Power(){

    public static void main(String[] args) {
        int x;
        double y,z;
        System.out.println("Enter any number: ");
        Scanner s=new Scanner(System.in);
        x = s.nextInt();
        y = Math.pow(x, 2);
        z = Math.pow(x, 3);
        System.out.println("Square of "+x+":"+y);
    }
}