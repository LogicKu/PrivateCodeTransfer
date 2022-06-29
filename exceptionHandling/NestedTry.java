package exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String k = "abc";
        try {
            try {
                System.out.println(k.charAt(3));
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            try {
                int aaa = Integer.parseInt("Hello");
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch (java.lang.Exception e){
            System.out.println("Hi"); //This doesn't work because above catch methods does
        }

    }

}
