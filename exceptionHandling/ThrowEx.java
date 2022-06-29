package exceptionHandling;

public class ThrowEx {
    public static void main(String[] args) {
        int a = 1;
        if (a>0){
            throw new ArithmeticException();  //to make exception
        }
    }
}
