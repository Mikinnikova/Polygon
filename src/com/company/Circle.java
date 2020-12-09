package com.company;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
