package com.miu.mpp.finalsprep.taxpayer;

import java.time.LocalDate;

public class TaxReturn {
    private int tid;
    private LocalDate submitDate;
    private Type type;

    public TaxReturn(int tid, LocalDate submitDate, Type type) {
        this.tid = tid;
        this.submitDate = submitDate;
        this.type = type;
    }
}

enum Type {

}
