package core.basesyntax;

public class Calculator {
    public double calculate(double value1, double value2, Character operation) {
        switch (operation) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                if (value2 == 0) {
                    throw new ArithmeticException();
                }
                return value1 / value2;
            case '^':
                return Math.pow(value1,value2);
            default:
                throw new RuntimeException("Invalid operator");
        }

    }
}