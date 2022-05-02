package Automation_Prac;

public class DoWhile {
    public static void method1() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        }
        while (i < 10);
    }

    //for loop and while loop works with condition first - while (i < 10) then do something,
    // while while loop is do something
    // do {
    // i++; then check the condition.
    public static void main(String[] args) {
        method1();
    }
}
