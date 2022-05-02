package Automation_Prac;

public class ClassA {
    public static void methodxyz() {
        int x = 10;
        int y = 50;
        int z;
        String name = "test 123";
        z = x - y;

        System.out.println(z);
    }

    public static void methodstring() {
        String a = "Om";
        String b = " Namah";
        String c = " Shivay";
        String d;
        String name = "Mantra";
        d = a + b + c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        methodxyz();
        methodstring();
    }
}
