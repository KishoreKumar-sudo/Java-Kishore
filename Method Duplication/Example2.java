// Method Duplication 2(Nt a gud practice)
public class Test {
    public int meth() {
        return 20;
    }

    public String meth() {
        return "Spiders";
    }

    public static void main(String[] args) {
        Test t = new Test();
        // Ambiguity/Conflict
        t.meth();
    }
}