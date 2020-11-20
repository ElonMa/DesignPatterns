package com.may.design.wrapper;

public class QiRuiCar implements Car {
    @Override
    public void run() {
        System.out.println("速度80km/h");
    }

    @Override
    public void stop() {
        System.out.println("车停了！");
    }
}
