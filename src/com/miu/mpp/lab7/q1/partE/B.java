package com.miu.mpp.lab7.q1.partE;

/**
 * @author bazz
 * Jan 31 2023
 * 17:05
 */
public interface B extends A{
    default void method(){
        System.out.println("hello B");
    }
}
