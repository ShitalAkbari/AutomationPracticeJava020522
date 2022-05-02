package Automation_Prac;

public class GlobalVariables {

    public static void methodGlobal (){
        var z = 30;
        int x = 5;
        int y = 50;

        int s= x * y * z;

        System.out.println(s);
    }

    public static void main(String[] args) {
        methodGlobal();
    }

}
