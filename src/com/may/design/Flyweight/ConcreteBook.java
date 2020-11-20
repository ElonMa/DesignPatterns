package com.may.design.Flyweight;

public class ConcreteBook implements Book {
    private String name;

    public ConcreteBook(String name){
        this.name = name ;
    }


    @Override
    public void borrow() {
        System.out.println("图书馆借出一本书，书名 ："+this.name);
    }
}
