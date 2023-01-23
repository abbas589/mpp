package com.miu.mpp.midtermprem;

import java.util.Date;

public class Son extends Father{
    private Date date;

    public Son(){
        this.date = new Date();
    }

    @Override
    public void tellTime() {
        System.out.println("Timeson = " + date.getTime());
    }

    public static void main(String[] args) {
        Father s = new Son();
        s.tellTime();
    }
}
