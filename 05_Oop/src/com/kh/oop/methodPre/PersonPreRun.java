package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    PersonPre na = new PersonPre();

    System.out.print("이름: ");
    String n = sc.nextLine();
    System.out.print("나이: ");
    int age = sc.nextInt();


    if(n.trim().length()==0) {
        System.out.println("빈칸은 이름으로 들어갈 수 없습니다.");
    } else {
        na.setName(n);
    }

    if(age<=0) {
        System.out.println("나이는 음수일 수 없습니다.");
    } else {
        na.setAge(age);
    }

    if(na.getName()!=null&&na.getAge()>0) {

      }

    }
}
