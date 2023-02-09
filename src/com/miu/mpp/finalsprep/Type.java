package com.miu.mpp.finalsprep;

/**
 * @author bazz
 * Feb 08 2023
 * 20:47
 */
public enum Type {

    _1040, _1040A("A"), _1040AEZ("EZ"), _1040ANR("NR");

    String val;

    Type(String a) {
        val = a;
    }

    Type() {

    }

    public static void main(String[] args) {
        System.out.println(Type._1040.val);
    }
}
