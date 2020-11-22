package com.may.design.observer;

import java.util.Vector;

public class Subject {
    private Vector<Observer>  oVector  = new Vector<>();

    public void addObserver(Observer observer){
        this.oVector.add(observer);
    }
    public void delObserver(Observer observer){
        this.oVector.remove(observer);
    }
    public void notifyObserver(){
        for( Observer o:oVector){
            o.update();
        }


    }


}
