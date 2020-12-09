package com.company;

public class Polygon extends Figure {

    private int[] sides;
    private int numberOfSides;


    public Polygon(String name, int numberOfSides) {
        super(name);
        this.numberOfSides = numberOfSides;
        sides = new int[this.numberOfSides];
    }

    public int[] getSides() {
        return sides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }


    public double getPerimetr() {
        int perimetr = 0;
        for (int a : sides
        ) {
            perimetr += a;
        }
        return perimetr;
    }

}
