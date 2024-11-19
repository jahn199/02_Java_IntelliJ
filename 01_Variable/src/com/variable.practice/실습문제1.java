package com.kh.src.com.variable.practice;

import java.util.Scanner;

public class 실습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자: ");

        char ch = sc.next().charAt(0);

        int changeNum = (int)ch;
        System.out.println("A Unicode : " + changeNum);

        //스캔이 모두 종료되면 닫아주기
        sc.close();//스캐너를 모두 사용하면 닫아주는 것이 좋음
    }
}
