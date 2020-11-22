package org.example;

public class CalculatorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorImpl();
        int result = calculator.sum(10,20);
        System.out.println(result);
    }
}
