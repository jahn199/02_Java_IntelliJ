package com.kh.src.com.variable.practice;

import java.util.Scanner;

public class 실습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("국어: ");
        int 국어 = sc.nextInt();

        System.out.print("영어: ");
        int 영어 = sc.nextInt();

        System.out.print("수학: ");
        int 수학 = sc.nextInt();


        int 총점 = 국어 + 영어 + 수학;


        int 평균 = 총점 / 3;


        System.out.println("총점: " + 총점);
        System.out.println("평균: " + 평균);
    }
}
