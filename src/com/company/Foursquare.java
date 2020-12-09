package com.company;

public class Foursquare extends Polygon {

    private int[] side;


    public Foursquare(int side) {
        super("Foursquare", 1);
        this.side = super.getSides();
        this.side[0] = side;

    }

    @Override
    public double getSquare() {
        return side[0] * side[0];
    }
}
