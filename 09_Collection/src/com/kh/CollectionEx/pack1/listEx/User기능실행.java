package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능실행 {
   public static void main(String[] args) {
       //1.Scanner 소환
       Scanner sc = new Scanner(System.in);

       //2.User기능 클래스 소환
       User기능 userStore = new User기능();

       while(true){
           System.out.println("\n ----사용자 관리 프로그램 ----");
           System.out.println("1. 사용자 추가");
           System.out.println("2. 추가된 유저 목록 모두 조회");
           System.out.println("3. 유저 삭제");
           System.out.println("4. 프로그램 종료");
           int choice = sc.nextInt();
           sc.nextLine();//int에 남아있는 잔여 줄바꿈 지우기

           switch (choice) {
               case 1:
                   System.out.print("사용자 이름 : ");
                   String username = sc.nextLine();
                   System.out.print("사용자 비밀번호 : ");
                   String password = sc.nextLine();
                   System.out.print("사용자 이메일 : ");
                   String email = sc.nextLine();
                   userStore.addUser(username,password,email);
                   break;
                   case 2:
                       userStore.allUsers();
                       break;
                       case 3:
                           userStore.removeUser();//유저 삭제 기능 설정
                           break;
                       case 4:
                           System.out.println("프로그램을 종료합니다.");
                           return;
                           default:
                               System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                               break;
           }
       }
   }
}
