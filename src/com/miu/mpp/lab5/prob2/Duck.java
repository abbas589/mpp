package com.miu.mpp.lab5.prob2;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehaviour quackBehavior;

    abstract public void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    protected void setFlyBehavior(FlyBehavior b) {
        flyBehavior = b;
    }

    protected void setQuackBehavior(QuackBehaviour b) {
        quackBehavior = b;
    }

    public void swim() {
        System.out.println("  swimming");
    }
}
