package Automation_Prac;

public class Datawith2parameters {

    public static void methodwithdata (int a, int b){
        System.out.println("Methodwith2parameters");
        // System.out.println("Methodwith2parameters"); is to show/display in console - just for our reference
        int c;
        c = a+b;
        System.out.println(c);

    }
public static void methodwithstring(String name){
    System.out.println(name);



}
    public static void main(String[] args) {
        methodwithdata(10, 20);
        methodwithdata(70, 290);
        methodwithdata(31, 24);
        methodwithdata(18, 22);
        methodwithdata(15, 20);
        methodwithstring("Shital");
        methodwithstring("910");
        methodwithstring("Piy@sh");
        methodwithstring("P00nam");
        methodwithstring("£$%&*@");
    }
    //similar way we can create method with 1 parameter , with 3, 4 5 or as many as parameter we want.
    // The parameter should be either Int, char or String but not mix of them.
}
