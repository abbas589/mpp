package com.miu.mpp.lab9.partii.q12;

/**
 * @author bazz
 * Feb 02 2023
 * 19:10
 */
public class Main {
    public static void main(String[] args) {

        MySingletonLazy instance = MySingletonLazy.getInstance();
        MySingletonLazy instance0 = MySingletonLazy.getInstance();
        MySingletonLazy instance1 = MySingletonLazy.getInstance();
        MySingletonLazy instance2 = MySingletonLazy.getInstance();
        MySingletonLazy instance3 = MySingletonLazy.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance0.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());

        System.out.println(MySingletonLazy.getInstanceCount());
    }
}
