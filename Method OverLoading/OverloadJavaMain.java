/* Can we overload java main()mtd?
Yes, by Mtd-overloading. You can have any no.of.main mtds in a class by m.o.l. */

/* If we have to perform only one operation, having same name of the methods increases the 
readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of 
arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three 
parameters then it may be difficult for you as well as other programmers to understand the behavior 
of the method because its name differs.

So, we perform method overloading to figure out the program quickly */

public class OverloadJavaMain {
    public static void main(String[] args) {
        System.out.println("main with string[]");
    }

    //But JVM calls main() mtd which receives string array as arguments only.
    public static void main(String args) {
        System.out.println("main with string");
    }

    public static void main() {
        System.out.println("main without args");
    }
}

/* Advantages:
M.O.L increases readability of program
To achieve compile time Polymorphism

It is possible in same class & even possible in case of Inheritance */