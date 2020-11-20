package com.may.design.Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *享元模式
 *
 *
 *如果在一个系统中存在多个相同的对象，那么只需要共享一份对象的拷贝,而不必为每一次使用都创建新的对象。目的是提高系统性能。
 *
 *
 */

public class Student {
    private static List<Book> books = new ArrayList<Book>();
    private static Library library;

    private static void studentBorrow(String bookname){
        books.add(library.libToBorrow(bookname));
    }
    public static void main(String[] args) {
        library =Library.getInstance();
        studentBorrow("book1");
        studentBorrow("book2");
        studentBorrow("book3");
        studentBorrow("book1");
        studentBorrow("book2");

        for (Book book:books){
            book.borrow();
        }

        System.out.println("学生借了"+books.size());
        System.out.println("图书馆借出"+library.getAllBookSize());




    }

}
