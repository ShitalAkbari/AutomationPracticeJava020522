package Automation_Prac;

public class Loop {

    public static void forLoop() {
        for (int i = 1; i <= 10; i++) {//initialisation, condition and incrementation.
            System.out.println(i);
        }


    }
    private static void forLoop1(){

        for (int i=2; i<=10; i+=2){
            System.out.println(i);//even numbers
        }
    }
protected static void forLoop2(){
        for (int i=1; i<=10; i+=2){
            System.out.println(i);//odd numbers
        }
}
    public static void main(String[] args) {
        forLoop();
        forLoop1();
        forLoop2();
    }
}

