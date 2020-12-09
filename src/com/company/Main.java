package com.company;

public class Main {

    public static void main(String[] args) {
        //
        Figure[] listFigures = new Figure[4];
        listFigures[0] = new Triangle(3, 4, 5);
        listFigures[1] = new Rectangle(2, 5);
        listFigures[2] = new Foursquare(7);
        listFigures[3] = new Circle(4);


        for (Figure figure : listFigures) {
            if (figure instanceof Polygon) {
                System.out.println(figure.getSquare());
            }
        }

        for (Figure figure : listFigures) {
            if (figure instanceof Circle) {
                System.out.println(figure.getSquare());
            }
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                if (triangle.getNumberOfSides() != 3) {
                    System.out.println(figure.getSquare());
                }
            }

            if (figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure;
                if (rectangle.getNumberOfSides() != 3) {
                    System.out.println(figure.getSquare());
                }
            }

            if (figure instanceof Foursquare) {
                Foursquare foursquare = (Foursquare) figure;
                if (foursquare.getNumberOfSides() != 3) {
                    System.out.println(figure.getSquare());
                }
            }
        }

        for (Figure figure : listFigures) {
            if (figure instanceof Polygon) {
                System.out.println(((Polygon) figure).getPerimetr());
            }
        }

    }
}
