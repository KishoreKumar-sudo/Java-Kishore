// OverRiding with different Signature
public class DifferentSignature {
    int meth(String s,boolean b){
        //Parent Logic
        return 22;
    }
}
class Child extends DifferentSignature{
    @Override
    int meth(String x,boolean y){
        //Child Log
        return 52;
    }
}
