class Test {
    public static void main(String[] args) {
        int [] marks = {42,44,46,48,50};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // ArrayIndexOutOfBoundsException
        try{
            //Risky Code
            System.out.println(marks[6]);
        }
         catch(Exception e){
            //Handling code
            e.printStackTrace();
            System.out.println(e);
             System.out.println(e.toString());
             System.out.println(e.getMessage());
         }
        
   

    }
}