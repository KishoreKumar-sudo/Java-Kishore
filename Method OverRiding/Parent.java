public class Parent {
    void meth() {
        //Parent Logic
    }
}
class Child extends Parent{
    @Override
    void meth(){
        //Child Logic
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.meth();
    }
}
