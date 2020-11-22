package org.example;

public class CalculatorImpl implements ICalculator {
    @Override
    public int sum(int x, int y) {
        // action: sum
        // action depends on data
        return x + y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        if(y == 0)
            return y;
        return x / y;
    }
}
