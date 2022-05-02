package Automation_Prac;

import java.util.Date;

public class DateTime {
    public static void method1(){
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
    }

    public static void main(String[] args) {
        method1();
    }
}
