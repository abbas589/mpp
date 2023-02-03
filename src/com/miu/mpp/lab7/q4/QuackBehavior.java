package com.miu.mpp.lab7.q4;

public interface QuackBehavior {
	default void quack(){
		System.out.println("quacking");
	}
}
