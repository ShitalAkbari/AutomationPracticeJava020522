package Automation_Prac;

public class DataType {

    public static void datatype(){
        int a =10;
        System.out.println(a);
        String name = "Shital";
        System.out.println(name);
        char a1 = 'S';
        System.out.println(a1);
        Boolean passed = true;
        System.out.println(passed);
        Boolean failed = false;
        System.out.println(failed);
        long abc = 1212121212;
        //10 digit max
        System.out.println(abc);
        double p = 1.34;
        System.out.println(p);
        //numbers with decimal point
        float k = 12.34564545566899f;
        //A float data type in Java stores a decimal value with 6-7 total digits of precision.
        // So, for example, 12.12345 can be saved as a float, but 12.123456789 can't be saved as a float.
        // When representing a float data type in Java, we should append the letter f to the end of the data type;
        // otherwise it will save as double.

    }

    public static void main(String[] args) {
        datatype();
    }
}
