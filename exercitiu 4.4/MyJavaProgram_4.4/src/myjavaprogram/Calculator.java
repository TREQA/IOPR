package myjavaprogram;

public class Calculator implements Operations, Operands {

    public double a;
    public double b;

    public double add() {
        return a + b;
    }

    public double sub() {
        return a - b;
    }

    public double div() {
        return a / b;
    }

    public double mult() {
        return a * b;
    }

    public void setOperands(double a, double b) {
        this.a = a;
        this.b = b;
    }

}
