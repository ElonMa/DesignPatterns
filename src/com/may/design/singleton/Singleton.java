package com.may.design.singleton;

//懒汉式第一次调用时初始化
public class Singleton {
    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private  Singleton(){};
    public static final Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }


}
