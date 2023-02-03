package com.miu.mpp.lab7.q4;

abstract public class Duck implements FlyBehavior, QuackBehavior {

    abstract public void display();

    public void swim() {
        System.out.println("  swimming");
    }

}
