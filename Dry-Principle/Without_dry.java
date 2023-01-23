//Main class
class without_dry {

    // Method 1
    // For Mech department
    public void MECH() {
        System.out.println("This is Fire_Mech");
    }

    // Method 2
    // For Mech department college
    public void college() {
        System.out.println("MSEC - Chennai");
    }

    // Method 3
    // For ECE department
    public void ECE() {
        System.out.println("This is Electronics");
    }

    // Method 4
    // For Ece department college 1
    public void college1() {
        System.out.println("MIT - Chennai");
    }

    // Method 5
    // For IT department
    public void AutoMobile() {
        System.out.println("This is AutoMobile");
    }

    // Method 6
    // For IT department college2
    public void college2() {
        System.out.println("BIT - Erode");
    }

    // Method 7
    // Main Driver method
    public static void main(String[] args) {
        //Creating Object of class in main ()
        without_dry d = new without_dry();

        //Calling above methods one by one
        //as created above
        d.MECH();
        d.college();
        d.ECE();
        d.college1();
        d.AutoMobile();
        d.college2(); 
    }
}