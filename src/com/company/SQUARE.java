package com.company;

public class SQUARE implements SHAPE {
    private int side = 5;
    private int area;
    private int circ;
    public void calcArea() {
        int area = side*side;
        System.out.println("Area: " + area);
    }
    public void calcCirc() {
        int circ = side*4;
        System.out.println("Circumference: " + circ);
    }

}
