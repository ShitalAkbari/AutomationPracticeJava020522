package Automation_Prac;

public class IfElseMethod {
    private static void method1(String car) {
        if (car.equals("Toyota")) //if car == "Toyota")
        { System.out.println("My name is Toyota");
        }
        else if (car == "BMW"){
            //if (car.equalsIgnoreCase("bmw")) this statement will ignore the case sensitive and display the result
            //i=0 (= used to assign a value to a variable) means i's value is 0
            //i==0 (double == get used to compare so as a result it will give you true or false.
            System.out.println("My name is BMW");
        }
        else{
            System.out.println("Other");
        }

    }

    public static void main(String[] args) {
        method1("Toyota");
        method1("BMW");
    }
}
