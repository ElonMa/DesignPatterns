package com.may.design.singleton;

//饿汉式单例类.在类初始化时，已经自行实例化
public class Singleton2 {
    private  static final Singleton2 single = new Singleton2();
    private Singleton2(){};
    public static Singleton2 getInstance(){
        return single;
    }
}
