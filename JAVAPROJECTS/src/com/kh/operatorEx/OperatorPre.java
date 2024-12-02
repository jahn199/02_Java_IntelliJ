package com.kh.operatorEx;

public class OperatorPre {

    public static void main(String[] args) {
        System.out.println("----- 전위 연산자 -----");
        int a = 5;
        System.out.println("a의 값 : " + a);
        int result1 = ++a;//++a == a+1 = a(+1이 완성된 a)
        //5+1로 6이 된 a를 result1에 넣어줌
        System.out.println("a의 값 : " + a);
        System.out.println("result1의 값 : " + result1);

        System.out.println("----- 후위 연산자 -----");
        //현재 값을 먼저 사용하고, 이후에 변수의 값이 증가 또는 감소
        int b= 5;
        System.out.println("b의 값 : " + b);
        int result2 = b++;//우선은 result2에 b = 5 값을 넣어주고, b +1 을 진행
        System.out.println("b의 값 : " + b);
        System.out.println("result2의 값 : "+result2);
    }
}
