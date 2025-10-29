package org.exception;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Basic Try Catch
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }finally {
            System.out.println("Execution completed.");
        }

        Example example = new Example();
        try{
            example.checkAge(13);
        }catch (ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }


    }
}