package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //
        Figure[] listFigures = new Figure[6];
        listFigures[0] = new Triangle(3, 4, 5);
        listFigures[1] = new Triangle(3, 4, 5);
        listFigures[2] = new Triangle(5, 4, 5);
        listFigures[3] = new Triangle(3, 4, 5);
        listFigures[4] = new Triangle(5, 5, 5);
        listFigures[5] = new Triangle(6, 4, 5);
        /*listFigures[1] = new Rectangle(2, 5);
        listFigures[2] = new Foursquare(7);
        listFigures[3] = new Circle(4);*/


        /*for (Figure figure : listFigures) {
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
        }*/
        ArrayList<Triangle> triangleArrayList = new ArrayList<>();
        int count = 1;
        for (Figure figure : listFigures) {
            if (figure instanceof Triangle) {
                triangleArrayList.add((Triangle) figure);
            }

        }
        for (int i = 0; i < triangleArrayList.size(); i++) {

            for (int j = i + 1; j < triangleArrayList.size(); j++) {
                if (triangleArrayList.get(i).getFirstSide() == triangleArrayList.get(j).getFirstSide() &&
                        triangleArrayList.get(i).getSecondSide() == triangleArrayList.get(j).getSecondSide() &&
                        triangleArrayList.get(i).getThirdSide() == triangleArrayList.get(j).getThirdSide()) {
                    System.out.println(triangleArrayList.get(i).getName() + "  " + triangleArrayList.get(i).getName());
                    count++;
                }
            }

        }
        System.out.println("Vsego odinak traengls " + count);


    }
}
