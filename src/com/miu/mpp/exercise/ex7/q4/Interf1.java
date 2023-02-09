package com.miu.mpp.exercise.ex7.q4;

/**
 * @author bazz
 * Feb 07 2023
 * 14:22
 */
public interface Interf1 {

    default int myMethod(int x) {
        return 2 * x;
    }
}
