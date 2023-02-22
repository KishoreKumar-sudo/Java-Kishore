// Method Duplication(Best practice)
public class Example1 {
    public int meth() {
        return 20;
    }

    public String meth(int i) {
        return "Spiders";
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.meth();
    }
}