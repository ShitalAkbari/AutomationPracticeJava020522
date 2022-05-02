package Automation_Prac;

public class StringFunctions {
    public static void method1(String name) {
        System.out.println(name.length());
        System.out.println(name.compareTo("HIMANI"));
        System.out.println(name.compareToIgnoreCase("HIMANI"));
        System.out.println(name.equals("himani"));
        System.out.println(name.equalsIgnoreCase("himani"));
        System.out.println(name.contains("i"));
        System.out.println(name.contains("H"));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.concat("Surname"));
        System.out.println(name + "     " + "Surname");
        System.out.println(name.trim());//this will cut down the spaces before and afrter but not in between.
    }

    public static void method2() {
        String abc = "test1@test2@test3@test4@test5";

        String[] abcArray = abc.split("@");
        System.out.println(abcArray[2]);
        try {
            System.out.println(abcArray[6]);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Hey, Error");
        }//try catch normally used by developer but good to have knowledge.
    }
    public static void method3(){
        String abc = "test1@test2@test3@test4@test5";
        System.out.println(abc.replace("@","$"));
        System.out.println(abc.replace("@$","$"));//If there is nothing to replace, it will print as it is.
    }

    public static void main(String[] args) {
        method1("      Himani     ");
        method2();
        method3();
    }
}
