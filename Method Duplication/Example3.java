// Method Duplication 3(Nt a gud practice)
public class Quiz {
    void meth(String s) {

    }

    void meth(Product p) {

    }

    public static void main(String[] args){
          Quiz q = new Quiz();
          //Error occurs both mtd takes null as default value 
          q.meth(null);
    }
}