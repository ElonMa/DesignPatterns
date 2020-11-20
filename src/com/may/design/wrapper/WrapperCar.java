package com.may.design.wrapper;

public class WrapperCar implements Car {
    private Car car;

    public WrapperCar(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println("新发动机  200km/h ");
    }

    @Override
    public void stop() {
        car.stop();
    }
}
