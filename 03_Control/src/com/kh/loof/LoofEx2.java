package com.kh.loof;

import java.util.Scanner;

public class LoofEx2 {
    Scanner sc = new Scanner(System.in);

    //while 문을 이용해서 while문이 false가 될 때까지 계속 실행
    /*
    반복문의 한 종류
    특정 조건이 참(true)인 동안 계속해서 코드를 실행
    특정 조건이 거짓(false)인 경우 반복을 종료
     */

    public void while1() {
        int i = 1;
        while (i <= 5) {
            //i값이 1 ~ 5까지 일 때만 실행이 되는 공간
            System.out.println(i);//출력이 되지만 i값이 무조건 1이기 때문에 무한 반복이 발생
            i++;
        }
    }
    public void while2() {
        boolean xyz = true;

        while (xyz) {
            System.out.println("현재값 xyz : " + xyz);
            System.out.println("xyz의 값을 false로 변경하려면 no를 입력하세요.");
            String input = sc.nextLine();

            //equalsIgnoreCase : 대소문자를 구분하지 않고 문자열을 비교하는 기능
            if(input.equalsIgnoreCase("no")) {
                xyz = false;
            }


        }
        System.out.println("xyz가 false로 설정되어 반복이 종료되었습니다.");
    }
    public void while3() {
        System.out.println("=== 0이 되면 종료되는 세상 ===");
        //초기값을 0이 아닌 아무 숫자나 설정
        int input = -1;

        while(input != 0) {
            System.out.print("숫자를 입력하세요(0을 입력하면 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void while4() {
        System.out.println("음수가 되면 종료");
        int abc = 0;

        while(abc >= 0) {
            System.out.print("숫자를 입력하세요(음수를 입력하면 종료) : ");
            abc = sc.nextInt();
            System.out.println("입력된 숫자 : " + abc);
        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void while5() {

        System.out.println("=== 메뉴판 ===");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 라떼 - 4000원");
        System.out.println("3. 카푸치노 - 4500원");
        System.out.println("4. 주문 종료");
        System.out.print("메뉴를 선택하세요 (1~4)");
        int input = sc.nextInt();

        while()
    }
}

