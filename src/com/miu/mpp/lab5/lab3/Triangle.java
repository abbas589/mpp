package com.miu.mpp.lab5.lab3;

public final class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        return 1/2 * base * height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
