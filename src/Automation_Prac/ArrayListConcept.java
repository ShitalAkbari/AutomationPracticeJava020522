package Automation_Prac;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void method1() {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Test1");
        a1.add("Test2");
        a1.add("Test3");
        a1.add("Test4");
        a1.add("Test5");
        a1.add("Test6");
        System.out.println(0);
        System.out.println(a1.size());
       // int j = a1.size();
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));

        }
    }

    public static void main(String[] args) {
        method1();
    }
}

