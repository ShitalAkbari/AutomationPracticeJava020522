package Automation_Prac;

public class PrivateMethod {
    private static void Private_method() {

        System.out.println("Private Method, Can access by (Within the Class) this  class only and can not inheritance or interface to other class");
    }


    public static void main(String[] args) {
        Private_method();

    }
}