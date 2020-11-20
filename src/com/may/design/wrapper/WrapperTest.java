package com.may.design.wrapper;


/**
 *装饰器模式在不改变现有类方法签名的前提下，对当前的类进行了增强。
 *
 *被增强类、增强类实现同一个接口
 *增强类持有被增强类的引用
 *被增强的方法调用增强类的方法，其他方法保持原有的继续使用被增强类的旧方法
 *
 *
 */


public class WrapperTest {

    public static void main(String[] args) {
        Car car = new WrapperCar(new QiRuiCar());
        car.run();
        car.stop();
    }


}
