package com.miu.mpp.lab5.prob2;

public class MallerDuck extends Duck {
    public MallerDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
