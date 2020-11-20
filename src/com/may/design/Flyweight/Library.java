package com.may.design.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String,Book> bookPools = new HashMap<String,Book>();
    private static Library factory = new Library();
    private Library(){};
    public static  Library getInstance(){
        return factory;
    }
    public Book libToBorrow(String bookname){
        Book order = null;
        if(bookPools.containsKey(bookname)){
            order= bookPools.get(bookname);
        }
        else{
            order = new ConcreteBook(bookname);
            bookPools.put(bookname,order);

        }
        return order;
    }
    public int getAllBookSize(){
        return bookPools.size();
    }

}
