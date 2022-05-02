package Automation_Prac;

public class ReturnMethod {
    public static int Method1(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);

        return c;
        //can return only one variable - not more, return statement should be at the end before closing bracket }.
    }

    public static void main(String[] args) {
        int c1 = Method1(20, 20);
        System.out.println(c1);
        c1 = Method1(30, 50);
        System.out.println(c1);
        c1 = Method1(600, 200);
        System.out.println(c1);
        c1 = Method1(500, 100);
        System.out.println(c1);
        c1 = Method1(230, 470);
        System.out.println(c1);
    }


}
