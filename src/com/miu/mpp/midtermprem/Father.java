package com.miu.mpp.midtermprem;

import java.util.Date;

public class Father {
    public Father() {
        tellTime();
    }

    public void tellTime() {
        Date date = new Date();
        System.out.println("Time = " + date.getTime());
    }
}
