package com.miu.mpp.lab7.q2;

public class Ellipse implements ClosedCurve {
	private double a;
	private double e;
	public Ellipse(double sma, double eie) {
		a = sma;
		e = eie;
	}
	@Override
	public double computePerimeter() {
		return 4 * a * e;
	}

}
