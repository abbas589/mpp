package com.miu.mpp.lab3.prob3.a;

public class Circle extends Cylinder {

    private double radius;

    public Circle(double height, double radius) {
        super(height, radius);
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return  Math.PI * Math.pow(radius, 2);
    }
}
