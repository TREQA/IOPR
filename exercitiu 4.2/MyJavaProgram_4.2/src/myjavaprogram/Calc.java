package myjavaprogram;

public class Calc {

    public static double area(Object shape) {

        if (shape.getClass() == Circle.class) {
            return Math.pow(((Circle) shape).r, 2) * Math.PI;
        }
        if (shape.getClass() == Rectangle.class) {
            return ((Rectangle) shape).a * ((Rectangle) shape).b;
        }
        return 0;

    }
}
