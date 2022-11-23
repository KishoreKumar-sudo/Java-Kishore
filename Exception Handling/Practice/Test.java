class Test{
    public static void main(String[] args) {
    try {
        //Risky Code
        System.out.println(10/0);
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
        System.out.println(e);
        // System.out.println(e.toString());
        // System.out.println(e.getMessage());
    } 
       
    }
}