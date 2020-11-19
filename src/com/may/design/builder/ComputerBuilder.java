package com.may.design.builder;

public abstract  class ComputerBuilder {

    public abstract  void setUsbCount();
    public abstract  void setKeyboard();
    public abstract  void setDisplay();

    public abstract Computer getComputer();
}
