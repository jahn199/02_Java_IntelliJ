package com.kh.poly.pack2.maver.bookPre;

public class BookRun {
    public static void main(String[] args) {
        
        EBook e = new EBook("자바 프로그래밍","홍길동",20000,"15.5MB");
        System.out.println(e.toString());
        PrintBook p = new PrintBook("파이썬 입문","이영희",18000,3000);
        System.out.println(p.toString());
    }
}
