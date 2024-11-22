package com.kh.oop.constructor;

public class SnackRun {
    public static void main(String[] args) {
        Snack s1 = new Snack();
        s1.setName("초코칩 쿠키");
        s1.setPrice(1500);
        s1.setTaste("달콤한 초코맛");

        Snack s2 = new Snack();
        s2.setName("허니버터집");
        s2.setPrice(2000);
        s2.setTaste("달콤한 버터맛");

        Snack s3 = new Snack("새우깡",1200,"짭짤한 새우맛");

        String result1 = s1.toString();
        System.out.println(result1);

        String result2 = s1.toString();
        System.out.println(result2);

        String result3 = s1.toString();
        System.out.println(result3);
    }
}
