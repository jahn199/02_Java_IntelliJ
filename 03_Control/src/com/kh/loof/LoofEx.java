package com.kh.loof;

import java.util.Scanner;

public class LoofEx {
    //필드 =변수명

    //앞으로 만드는 public void 기능명(메서드 = method) {}
    //public static void main(String[] args) {}
    //내부에서 sc를 사용할 수 있음!
    //단 ! 한 파일당 하나씩 외부 파일에서 변수를 사용할 때는
    //새로 선언해서 사용 (Scanner sc = new Scanner(System.in);)
    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("a값 확인하기: " + a);

        /*1부터 10까지 출력하기 = for문을 활용해서 */
        for(int i = 0; i<= 10; i++){
            System.out.println("i의 값 : " + i);
        }
    }

    //Class 중괄호 가장 바깥에 작성한 변수 = 전역 변수 = 필드 = field

    //Class 안에서 Method 안에 작성한 변수 지역변수

    public void method2() {
        System.out.println("숫자1은 숫자2보다 수가 적어야 함");
        System.out.println("숫자1: ");
        int a = sc.nextInt();
        System.out.println("숫자2: ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("첫 번째 값은 두 번째 값보다 수가 작아야합니다.");
        } else if (b > a ) {
            for(int i = 0; i<= b; i++){
                System.out.println("a" + a + "값, b" + b + "값");
                System.out.println("i의 값은 : " + i);
            }
        } else {
            System.out.println("두 개의 값이 동일합니다.");
        }
    }

    public void method3() {

        for(int i = 10; i>= 1; i--){
            System.out.println(i);
        }
    }

    public void method4() {
        System.out.println("숫자 1을 입력하세요");
        int a = sc.nextInt();
        System.out.println("숫자 2를 입력하세요");
        int b = sc.nextInt();

        if(b > a) {
            for(int i = 0; i<= b; i++){
                System.out.println(i);
            }

        }else if (a > b) {
            for(int i = 0; i>= b; i--){
                System.out.println(i);
            }
        }else {
            System.out.println("같은 수가 입력됩니다.");
        }
    }
}

