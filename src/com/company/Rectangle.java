package com.company;

public class Rectangle extends Polygon {

    private int[] sides;

    public Rectangle(int length, int width) {
        super("Rectangle", 2);
        sides = super.getSides();
        sides[0] = length;
        sides[1] = width;
    }

    @Override
    public double getSquare() {
        return sides[0] * sides[1];
    }
}
