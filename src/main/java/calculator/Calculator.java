package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqrt_divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Division by zero is undefined");
        }
        double c = (double) a / b;
        if (c < 0) {
            throw new ArithmeticException("Sqrt can not applied on negative number");
        }
        return Math.sqrt(c);
    }
}