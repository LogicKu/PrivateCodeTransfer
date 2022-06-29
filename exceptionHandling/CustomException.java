package exceptionHandling;


public class CustomException extends Throwable {
    String l;

  CustomException(String a) {
        String l = a;
    }
    void message(){
        System.out.println(l);
    }
    public static void main(String[] args) {
       try {
           throw new CustomException("ok");
       }catch (CustomException obj){
           obj.message();
       }
        System.out.println(A);

    }
    private static final int A = 245;


}
