package com.may.design.builder;

public class Test {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        MacComputerBuilder macComputerBuilder = new MacComputerBuilder("A13","12g");
        director.makeComputer(macComputerBuilder);
        Computer mac = macComputerBuilder.getComputer();
        System.out.println(mac.toString());


        HuaWeiComputerBuilder huaWeiComputerBuilder = new HuaWeiComputerBuilder("麒麟","10g");

        director.makeComputer(huaWeiComputerBuilder);
        huaWeiComputerBuilder.getComputer();
        Computer huawei  = huaWeiComputerBuilder.getComputer();
        System.out.println(huawei.toString());


        Computer2 computer2 = new Computer2.Builder("ABC","16").setDisplay("TCL").setKeyBoard("机械键盘").setUsbCount(2).build();
        System.out.println(computer2.toString());
    }
}
