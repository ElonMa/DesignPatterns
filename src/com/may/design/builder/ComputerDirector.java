package com.may.design.builder;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        builder.setDisplay();
        builder.setKeyboard();
        builder.setUsbCount();

    }

}
