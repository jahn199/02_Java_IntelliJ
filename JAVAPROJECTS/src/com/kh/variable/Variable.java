package com.kh.variable;

public class Variable {
    public static void main(String[] args) {
        //변수 선언 : 메모리에 공간 생성
        boolean isTrue; //컴퓨터 메모리에 boolean 저장공간 1byte를 생성하고 0개의 사용위치
        //아직 그 공간에는 아무것도 없는 상태이지만
        //그 공간의 이름을 isTrue라고 부르겠다.

        //값 대입: 변수에 값을 집어넣는 것 (이미 값이 존재하는 변수에 대입하면 --> 덮어쓰기)
        isTrue = true;

        //변수선언 + 초기에 num1이라는 공간에 들어갈 값까지 한 번에 설정
        int num1 = 100;

    }
}