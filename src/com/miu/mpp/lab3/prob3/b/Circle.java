package com.miu.mpp.lab3.prob3.b;

import com.miu.mpp.lab3.prob3.a.Cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return  Math.PI * Math.pow(radius, 2);
    }
}
