package Automation_Prac;

public class MethodStringPera {

    public static void method1(String car) {

        System.out.println(car + " is a brand");
    }

    public static void method2(String colour) {

        System.out.println(colour + " is a colour");
    }

    public static void main(String[] args) {
        method1("Toyota");
        method1("BMW");
        method1("Audi");
        method1("Fiat");
        method2("red");
        method2("blue");
        method2("Green");
        method2("black");
    }
}
