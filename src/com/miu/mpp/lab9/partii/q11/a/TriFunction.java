package com.miu.mpp.lab9.partii.q11.a;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
