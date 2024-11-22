package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 r2 = new ReturnPre2();

        System.out.println(r2.introduce("홍길동", 40));

        System.out.println(r2.compare(123,456));

        System.out.println(r2.classify(85));

        System.out.println(r2.cost(100000,20));

        int[] numbers = {10,20,30,40,50};
        System.out.println(r2.just(numbers));

        System.out.println(r2.check(17));

        System.out.println(r2.add("Hello", "World"));

        String fruits1[] = {"apple","banana","cherry"};
        System.out.println(r2.fruits(fruits1,"banana"));

        System.out.println(r2.toString(7));
    }
}
