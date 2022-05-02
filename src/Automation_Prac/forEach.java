package Automation_Prac;

import java.util.ArrayList;

public class forEach {
    public static void method1() {
        String[] carmodelarray = {"BMW", "Toyota", "Audi", "Fiat", "Honda",};
        for (String car : carmodelarray) {
            System.out.println(car);
        }
        //for each can only get used with array or arraylist as above.
        //for each get normally get used with String and not with integer or character.
          //the method each don't use "each" word but will show each result from the data.
        //for loop can be used with odd or even data or can skip the data from the whole data

    }

    public static void main(String[] args) {
        method1();
    }
}
