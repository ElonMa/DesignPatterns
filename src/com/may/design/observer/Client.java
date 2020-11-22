package com.may.design.observer;

public class Client  {

    public static void main(String[] args) {
        ConcreteSubject  subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.addObserver(observer);
        subject.addObserver(observer2);
        subject.doSomething();




    }


}
