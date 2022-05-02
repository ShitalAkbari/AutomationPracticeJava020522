package Automation_Prac;

public class ReturnMethodPrac {

    public static String MethodReturnPrac (String colour){
        String colour1;
        colour1 = colour + "mix it with blue";
        System.out.println(colour);


        return colour1;
    }

    public static void main(String[] args) {
       String colour2 = MethodReturnPrac("red");
        System.out.println(colour2);
    }



}
