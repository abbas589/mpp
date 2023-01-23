package com.miu.mpp.lab5.lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(59));
        shapes.add(new Rectangle(59, 45));
        shapes.add(new Triangle(29, 65));

        double sumOfAreas = 0.0;

        for (Shape shape : shapes) {
            sumOfAreas += shape.computeArea();
        }
        System.out.println("Sum of Areas : " + sumOfAreas);
    }
}
