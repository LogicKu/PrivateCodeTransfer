package exceptionHandling;

public class MethodException {
    static void sum (){
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        try {
           sum();
        }
        catch (ArithmeticException e) {
            System.out.println("1");
        }
    }
}
