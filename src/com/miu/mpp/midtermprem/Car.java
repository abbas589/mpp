package com.miu.mpp.midtermprem;

public class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("car started");;
    }

    static void stop(){
        System.out.println("car stopped");
    }
}
