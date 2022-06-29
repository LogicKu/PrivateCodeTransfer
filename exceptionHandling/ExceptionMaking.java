package exceptionHandling;

import java.util.Scanner;

public class ExceptionMaking {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();
        if (age<18){
            throw new ArithmeticException();
        } else System.out.println("Succeed");
    }
}
