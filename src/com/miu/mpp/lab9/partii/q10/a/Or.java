package com.miu.mpp.lab9.partii.q10.a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true), new Simple(false));

		System.out.println(someSimpleIsTrue(list));
	}
	
	public static boolean someSimpleIsTrue(List<Simple> list) {

		return list.stream().map(v->v.flag).reduce(false,(x,y)-> x || y);
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;
	}

}
