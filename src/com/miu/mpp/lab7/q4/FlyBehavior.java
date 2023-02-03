package com.miu.mpp.lab7.q4;

public interface FlyBehavior {
	default void fly(){
		System.out.println("Flying");
	}
}
