//ClassCastException

class Main {
    public static void main(String[] args) {
        
         /*  String ename = "Kishore";
          Object obj1 = (Object)ename;
          System.out.println(obj1); */
         

        Object obj = "Hiiii";

        String msg = (String) obj;
        Integer i = (Integer) obj;

        System.out.println(msg);
        System.out.println(i);
    }
}