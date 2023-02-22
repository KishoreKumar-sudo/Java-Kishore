/* Constructor Overloading
In a clas having more than 1 constructor with same Signature
 */
public class Accountdetail {
    long accNumber;
    double balance;
    String name;
    public Accountdetail(long accNumber, double balance, String name) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
    }  
    public Accountdetail(long accNumber){
        this.accNumber = accNumber;
    }
    public Accountdetail(){

    }
    public static void main(String[] args) {
         Accountdetail ac1 = new Accountdetail();
         System.out.println(ac1.accNumber +" "+ac1.name+" "+ ac1.balance);
          Accountdetail ac2= new Accountdetail(987654321);
          System.out.println(ac2.accNumber+" "+ac2.name+" "+ac2.balance);
          Accountdetail ac3 = new Accountdetail(987654321, 42000, "Spiders");
          System.out.println(ac3.accNumber+" "+ac3.name+" "+ac3.balance);
    }
}
