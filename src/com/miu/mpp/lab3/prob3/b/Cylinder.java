package com.miu.mpp.lab3.prob3.b;

public class Cylinder {
    private Circle circle;
    private double height;

    public Cylinder(double radius, double height) {
        circle = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public Circle getCircle() {
        return circle;
    }

    public double computeArea() {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
