package com.itheima.domain;

public class Total extends Saleinfo {
    private double num;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Total{" +
                "num=" + num +
                '}';
    }
}
