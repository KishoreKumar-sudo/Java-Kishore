import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of floyd's triangle you want");
        n = in.nextInt();
        System.out.println("Floyd's Triangle :-");
        for (c = 1; c <= n; c=c+1)
         {
            for (d = 1; d <= c; d=d+1)
             {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}
