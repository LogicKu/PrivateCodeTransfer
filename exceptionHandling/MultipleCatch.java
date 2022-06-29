package exceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        String k = "abc";
        try {
            System.out.println(a/b);
            System.out.println(k.charAt(3));
            int aaa = Integer.parseInt("Hello");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("1st catch");
        }
        catch (NumberFormatException e){
            System.out.println("2nd catch");
        }
        catch (java.lang.Exception e){
            System.out.println("3rd catch");  //General Exception is always last
        }
    }
}
