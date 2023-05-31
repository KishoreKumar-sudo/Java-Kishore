public class Two {
    public static void main(String[] args) {
        short x=10;
        x=x*5;
        //Only possible way of Automatic type conversion is int to long
        System.out.println(x);
        //compile-time-error: incompatible types: possible lossy conversion from int to short
    }
}
