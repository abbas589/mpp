package com.miu.mpp.lab5.prob2;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new CannotFly());
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}
