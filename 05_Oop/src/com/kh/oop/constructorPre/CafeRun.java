package com.kh.oop.constructorPre;


import java.util.Scanner;

public class CafeRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe c1 = new Cafe();

        System.out.println("메뉴 작성해주세요 :");
        String name = sc.nextLine();
        System.out.println("가격 작성해주세요: ");
        int price = sc.nextInt();
        System.out.println("수량 작성해주세요: ");
        int quantity = sc.nextInt();

        Cafe c = new Cafe(name,price,quantity);

        System.out.println(c.toString());
        System.out.println(c.주문총액(price,quantity));

    }
}

