// Method Duplication
// In a class when we have more than one method with same name & same signature 
public class AirtelExample {
    // netbanking
    void makePayment(String un,String pwd){
        //body / Logic 

    //paytm
    void makePayment (long mobNo){
        //body / Logic
    }
    
    //credit/debit card
    void makePayment(long cardNo,int cvv,String name, String expDate){
        //body / Logic
    }
    }
}

// Method Duplication 1(Nt a gud practice)
public class Quiz {
    void meth(String s, double d) {

    }

    void meth(String d, double s) {

    }
}



// Method Duplication(Best practice)
public class Test {
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
