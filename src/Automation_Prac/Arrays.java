package Automation_Prac;

public class Arrays {

    public static void arrays1() {
        String EmployeeName = "Shital";
        String EmployeeName1 = "Shital";
        String EmployeeName2 = "Sandeep";
        String EmployeeName3 = "Shree";
        String EmployeeName4 = "Poonam";
        String EmployeeName5 = "Tarak";
        System.out.println(EmployeeName3);

        System.out.println("Starting of Arrays");

        String[] EmployeeName_Array = {"Shital", "Sandeep", "Shree", "Poonam", "Tarak"};
        //it starts to count from 0 so Shital is 0 and Sandeep is 1 in above
        int[] EmployeeNumber_Array = {2030, 1234, 2098, 3465, 4536, 5549};
        System.out.println(EmployeeName_Array[0]);
        System.out.println(EmployeeNumber_Array[2]);
        System.out.println(EmployeeNumber_Array.length);
    }

    public static void main(String[] args) {
        arrays1();
    }
}
