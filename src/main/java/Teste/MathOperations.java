package Teste;

public class MathOperations implements BasicOperators {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    @Override
    public double multi(double a, double b) {
        return a * b;
    }

    @Override
    public double fact(int a) {
        if (a == 1) {
            return 1;
        }
        return a * fact(a - 1);
    }
}
