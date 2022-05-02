package Automation_Prac;

public class SwitchCaseMethod {
    private static String method1(String car) {
        switch (car) {
            case "Toyota":
                System.out.println("My name is Toyota");
                break;
            case "BMW":
                System.out.println("My name is BMW");
                break;
            case "Fiat":
                System.out.println("My name is Fiat");
                break;
            default:
                System.out.println("Other");
                break;
        }

        return "something";
    }
//return method created for practice only

    public static void main(String[] args) {
        method1("Toyota");
        method1("BMW");
        method1("Honda");//to get result as "Other"
    }
}