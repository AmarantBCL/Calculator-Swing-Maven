package ua.hillel.calculator;

public class DivideOperation implements ArithmeticOperation {
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
