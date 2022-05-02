package Automation_Prac;

public class BooleanTest {
    public static boolean method1(int marks) {
        boolean passed = false;

        if (marks <= 35) {
            passed = false;
        } else if ((marks > 35) && (marks < 70)) {
            passed = true;
        }

        return passed;

    }

    public static void main(String[] args) {
        boolean ipassed = method1(60);
        System.out.println(ipassed);
    }
}
