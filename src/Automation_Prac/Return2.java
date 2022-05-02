package Automation_Prac;

import jdk.jshell.ImportSnippet;

public class Return2 {


    public static String method2(String Imp) {
        String Imp1 = Imp + " Test TBC";
        System.out.println(Imp1);
        System.out.println("____________");

        return Imp1;
    }

    public static void main(String[] args) {
        String Imp2 = method2("Shital");
        System.out.println(Imp2);
    }
}
