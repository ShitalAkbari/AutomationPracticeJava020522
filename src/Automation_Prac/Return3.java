package Automation_Prac;

public class Return3 {

    public static int method3(int a, int b) {
        int z = b - a;
        System.out.println(z);
        return z;
    }


    public static void main(String[] args) {
        int z1 = method3(34, 56);
        System.out.println(z1);
    }
}
