package com.miu.mpp.lab5.prob2;

public class RubberDuck extends Duck{
    public RubberDuck(){
        setQuackBehavior(new Squack());
        setFlyBehavior(new CannotFly());
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}
