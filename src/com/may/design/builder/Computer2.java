package com.may.design.builder;

public class Computer2 {
    private final String cpu;//must
    private final String ram;//must
    private final int usbCount;
    private final String keyboard;
    private final String display;

    private Computer2(Builder builder){
        this.cpu= builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    @Override
    public String toString() {
        return "Computer2{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    public static class Builder{

        private  String cpu;//must
        private  String ram;//must
        private  int usbCount;
        private  String keyboard;
        private  String display;

        public Builder(String cpu,String ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount){
            this.usbCount=usbCount;
            return  this;
        }

        public Builder setKeyBoard(String keyBoard){
            this.keyboard = keyBoard;
            return this;
        }

        public Builder setDisplay(String display){
            this.display = display;
            return this;

        }
        public Computer2 build(){
            return new Computer2(this);
        }

    }

}
