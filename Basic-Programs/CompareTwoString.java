import java.util.Scanner;

class CompareTwoString {
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the First String");
        s1 = in.nextLine();

        System.out.println("Enter the Second String");
        s2 = in.nextLine();
        if (s1.compareTo(s2) > 0)
            System.out.println("First String is greater than Second.");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First String is smaller than Second.");
        else
            System.out.println("Both Strings are equal");
    }
}
