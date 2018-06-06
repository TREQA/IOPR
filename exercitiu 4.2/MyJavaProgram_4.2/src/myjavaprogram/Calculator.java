package myjavaprogram;

public class Calculator {

    double operand1;
    double operand2;
    char operator;

    public double calculate(double operand1, double operand2, char operator) {
        double result;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
        
    }
}
