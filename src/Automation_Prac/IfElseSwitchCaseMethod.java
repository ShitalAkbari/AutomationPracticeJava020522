package Automation_Prac;

public class IfElseSwitchCaseMethod {
    public static void Testswitchcase1(int i) {

        String tstpass;
        if (i > 70) {
            tstpass = "A";
        } else if (i > 60) {
            tstpass = "B";
        } else if (i > 35) {
            tstpass = "C";
        } else {
            tstpass = "Fail";
        }
        switch (tstpass) {
            case "A":
                System.out.println("1st Class");
                break;
            case "B":
                System.out.println("2nd Class");
                break;
            case "C":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Failed");
        }

//when there is a range of data - < greater than or > less than, - we can't use use switch case.
    }

    public static void main(String[] args) {
        Testswitchcase1(32);
        Testswitchcase1(45);
        Testswitchcase1(62);
        Testswitchcase1(75);
    }


}
