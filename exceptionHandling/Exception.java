package exceptionHandling;

public class Exception {
    public static void main(String[] args) {
        String a = null;
        System.out.println("Before Exception");
        System.out.println(a.length());
        System.out.println("After Exception");
        String k = "abc";
       try {
           System.out.println(k.charAt(3)); //StringIndexOutOfBoundsException
       } catch (java.lang.Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("After exception");

        int aaa = Integer.parseInt("Hello"); //NumberFormatException
        int n1 = 2;
        int n2 = 0;
        try {
            try{
            System.out.println(n1 / n2); //ArithmeticException
        } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        finally {
            System.out.println("L");
        }
        try {
            System.out.println(n1 / n2); //ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("EEEEEEEEEEEEEEEEEEEEEE");
        }
        catch (ArithmeticException e) {
            System.out.println("D");
        }
    }
}