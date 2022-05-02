package Automation_Prac;

public class GlobalVariable {
    static int c;
    static String username;
//global variables - you can use anywhere in the class
    public static void method1(int a, int b) {
        c = a + b;
        username = "test abc";
        System.out.println(c);

    }

    public static void method2() {


        System.out.println(c);
    }

    public static void method3() {

        System.out.println(username);
    }

    public static void main(String[] args) {
        method1(10, 20);
        method2();
        method3();
    }
}
