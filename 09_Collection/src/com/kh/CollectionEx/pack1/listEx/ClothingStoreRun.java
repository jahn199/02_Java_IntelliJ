package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        ClothingStore store = new ClothingStore();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n --- 옷 쇼핑몰 관리 프로그램 ---");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 목록 조회");
            System.out.println("3. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();//int에 남아있는 잔여 줄바꿈 지우기

            switch (choice) {
                case 1:
                    System.out.print("옷 이름 : ");
                    String name = sc.nextLine();
                    System.out.print("카테고리(상의/하의/외투) : ");
                    String categorty = sc.nextLine();
                    System.out.print("가격 : ");
                    String price = String.valueOf(sc.nextLine());

                    store.addClothing(name, categorty, price);
                    break;
                    case 2:
                        store.delClothing();
                        break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                    default:
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        break;
            }
        }
    }
}
