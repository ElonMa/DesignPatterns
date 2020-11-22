package com.may.design.observer;

public class ConcreteSubject extends Subject {

    public void doSomething(){
        System.out.println("业务处理！");
        super.notifyObserver();
    }


}
