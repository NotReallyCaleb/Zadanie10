package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Square: ");
        SQUARE square = new SQUARE();
        square.calcArea();
        square.calcCirc();

        System.out.println("Rectangle: ");
        RECTANGLE rectangle = new RECTANGLE();
        rectangle.calcArea();
        rectangle.calcCirc();

        System.out.println("Triangle: ");
        TRIANGLE triangle = new TRIANGLE();
        triangle.calcArea();
        triangle.calcCirc();
    }
}
