package com.miu.mpp.lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLines;

    public Order(int orderNum) {
        this.orderNum = orderNum;
        orderLines = new ArrayList<>();
    }

    public void addOrderLine(OrderLine o) {
        orderLines.add(o);
    }
}
