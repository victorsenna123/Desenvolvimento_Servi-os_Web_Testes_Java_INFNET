package org.example;

public class Rectangle {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height;
    }


    // tp 8
    // Método com erro intencional
    public double getPerimeter() {
        return base * height; // Esta linha está errada, deveria ser 2 * (base + height)
    }
}
