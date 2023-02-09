package com.miu.mpp.exercise.ex7;


import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("Element at position 2: " + l.get(2));
		System.out.println("The list: " + l);


		Stream<String> strings = Stream.of("A","good","day","to","write","some","java");

		System.out.println(strings.reduce("", (x, y) -> x +" "+ y));

		Runnable runnable = () -> System.out.println("Tricke exam");


	}
}
