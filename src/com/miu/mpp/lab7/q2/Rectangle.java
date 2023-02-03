package com.miu.mpp.lab7.q2;

public final class Rectangle implements Polygon {
    final private double width;
    final private double length;

    @Override
    public double[] getSides() {
        return new double[]{length, length, width, width};
    }

    @Override
    public double computePerimeter() {
        return width * length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
