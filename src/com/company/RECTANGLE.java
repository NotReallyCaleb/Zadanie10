package com.company;

public class RECTANGLE implements SHAPE {
    private int sideA = 6;
    private int sideB = 9;
    private int area;
    private int circ;
    public void calcArea() {
        int area = sideA*sideB;
        System.out.println("Area: " + area);
    }
    public void calcCirc() {
        int circ = (sideA*2) + (sideB*2);
        System.out.println("Circufmerence: " + circ);
    }
}
