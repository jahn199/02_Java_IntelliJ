package com.kh.src.com.variable.practice;


import java.util.Scanner;

public class 실습문제3 {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum= 2.5;
        char ch = 'A'; // 'A' 는 유니코드값 65
        System.out.println( iNum1 / iNum2 ); // 몫으로 2
        System.out.println( (int) dNum ); // double을 정수로 변환 2
        System.out.println( iNum2 * dNum ); // 10.0
        System.out.println( (double) iNum1 ); // 정수를 실수로 변환 10.0
        System.out.println( iNum1 / (double)iNum2 ); // 정수 나눗셈 후 double로 변환 2.5
        System.out.println( dNum ); // 2.5 변수명 그대로 출력
        System.out.println( (int) fNum ); // 3  float을 정수로 변환
        System.out.println( iNum1 % fNum ); // 3 나머지 연산
        System.out.println( iNum1 % (int)  fNum ); // 1 나머지 연산
        System.out.println( iNum1 / fNum );// 3.3333333  float
        System.out.println( iNum1 / (double) fNum ); // 3.3333333333333335  dobule
        System.out.println( ch); // 'A' 변수명 그대로 출력
        System.out.println( (int) ch); // 65 ch -> int로 변환해서 출력해보기
        System.out.println( ch + iNum1 ); // 75 (문자와 정수의 덧셈, 유니코드 값으로 계산)
        System.out.println( (char) (ch + iNum1) ); // 'K'
    }
}