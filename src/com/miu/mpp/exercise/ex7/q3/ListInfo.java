package com.miu.mpp.exercise.ex7.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListInfo {
	List<String> list = new ArrayList<>();
	MyStringList strList = new MyStringList();
	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();

	}
	
	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");

		Consumer<String> consumer = val -> {
			strList.add(val);
			list.add("hello");
		};
		
		//use java8 foreach to copy all list elements into the array
		list.forEach(consumer);


		System.out.println(list.size());
		System.out.println(strList.size());
	}
}
