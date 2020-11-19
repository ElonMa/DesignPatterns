package com.may.design.builder;

public class HuaWeiComputerBuilder extends ComputerBuilder{
    private Computer computer;

    public HuaWeiComputerBuilder(String cpu, String ram) {
        computer =new Computer(cpu,ram);
    }

    @Override
    public void setUsbCount() {
        computer.setKeyboard("华为键盘");
    }

    @Override
    public void setKeyboard() {
        computer.setUsbCount(2);
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("华为显示器！");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
