package com.company;

public class Triangle extends Polygon {

    private int[] sides;


    public Triangle(int firstSide, int secondSide, int thirdSide) {
        super("Triangle", 3);
        sides = super.getSides();
        sides[0] = firstSide;
        sides[1] = secondSide;
        sides[2] = thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimetr = getPerimetr() / 2;

        return Math.sqrt(halfPerimetr * (halfPerimetr - sides[0]) * (halfPerimetr - sides[1]) * (halfPerimetr - sides[2]));
    }

    public int getFirstSide() {
        return sides[0];
    }

    public int getSecondSide() {
        return sides[1];
    }

    public int getThirdSide() {
        return sides[2];
    }
}
