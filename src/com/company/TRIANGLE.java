package com.company;

public class TRIANGLE implements SHAPE {
    private int base = 9;
    private int arm1 = 6;
    private int arm2 = 8;
    private int height = 5;
    private int area;
    private int circ;
    public void calcArea() {
        int area = (base * height) / 2;
        System.out.println("Area: " + area);
    }
    public void calcCirc() {
        int circ = base + arm1 + arm2;
        System.out.println("Circumference: " + circ);
    }
}
