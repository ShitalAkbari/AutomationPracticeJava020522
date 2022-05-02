package Automation_Prac;

public class Polymorphism {
    public static void Click() {
System.out.println("method with no parameter");
    }

    public static void Click(int a) {
System.out.println(a);
    }

    public static void Click(String name) {
System.out.println(name);
    }
//all above x 3 method are with same name but have different parameter or different data type - empty, int and string.
// In realtime when we click a button, this will be useful.
    public static void Click(int a, String name, int b){
        System.out.println(b);
        //mixed data type 1
    }
    public static void Click(String name, int a, char A){
        System.out.println(A);
        //mixed data type 2
    }
    public static void main(String[] args) {
        Click();
        Click(10);
        Click("Test the method");
        Click(30,"Shital", 50);
        Click("Test", 40, 'A');
    }
}
