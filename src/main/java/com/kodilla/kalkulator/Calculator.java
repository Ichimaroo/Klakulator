package com.kodilla.kalkulator;

public class Calculator {

    public void addition(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    public void substract(int a, int b){
        int c = a - b;
        System.out.println(c);
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.substract(5,10);
   }
}
