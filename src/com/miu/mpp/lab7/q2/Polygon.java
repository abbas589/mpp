package com.miu.mpp.lab7.q2;

/**
 * @author bazz
 * Jan 31 2023
 * 19:40
 */
public interface Polygon extends ClosedCurve {
    double[] getSides();

    @Override
    default double computePerimeter() {
        double sum = 0.0;
        for (double d : getSides()) {
            sum += d;
        }
        return sum;
    }
}
