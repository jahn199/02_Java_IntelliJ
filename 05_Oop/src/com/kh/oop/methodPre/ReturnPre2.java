package com.kh.oop.methodPre;

public class ReturnPre2 {

    public String introduce(String name, int age) {
        return "안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }

    public String compare(int num1, int num2) {
        if (num1 > num2 || num1 < num2) {
        }
        return num1 + "보다" + num2 + "이 큰 숫자입니다";
    }

    public String classify(int score) {
        if (score >= 90) {
            System.out.print("A");
        } else if (score >= 80) {
            System.out.print("B");
        } else if (score >= 70) {
            System.out.print("C");
        } else if (score >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
        return "입력한 점수: " + score + "등급: ";
    }
}
















