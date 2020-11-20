package com.may.design.facade;

public class Facade {
    Dancer dancer;
    Singer singer;
    public Facade(){
        dancer = new Dancer();
        singer = new Singer();
    }

    public void sing(){
        singer.sing();
    }
    public void dance(){
        dancer.dance();
    }

}
