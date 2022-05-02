package Automation_Prac;

public class ClassB extends ClassA {
//Call method from different class (It is called Inheritance)

    public static void main(String[] args) {
        //below method is extended from ClassA
        methodxyz();
        ClassC a1 = new ClassC();
        //created a link between ClassB and Class C with above, a1 is just a nick name
        a1.Interfacemethod();
    }

}
//Create always unique method name - do not repeat the same name again.
