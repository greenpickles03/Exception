package org.exception;

//Throw and Throws Example
public class Example {

    public void checkAge(int age) throws ArithmeticException{
        if(age < 18){
            throw new ArithmeticException("Age is not valid to vote.");
        }else{
            System.out.println("Welcome to vote!");
        }
    }

}
