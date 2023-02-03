package com.miu.mpp.lab7.q4;

import java.util.Comparator;
import java.util.function.Supplier;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("  displaying");

		Supplier<Double> random = () -> Math.random();
		random.get();
	}
}
