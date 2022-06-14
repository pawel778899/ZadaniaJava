package Zadanie1;

public class Circle {

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double calculatePerimeter(){
        return Math.PI*diameter;
    }



}
