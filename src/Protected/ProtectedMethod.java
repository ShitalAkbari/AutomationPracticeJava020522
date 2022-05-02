package Protected;

public class ProtectedMethod {

    protected static void ProtectedMethod(){
        System.out.println("Protected Method, Can not access from other protject but can access from same project only");
    }

    public static void main(String[] args) {
        ProtectedMethod();
    }
}
