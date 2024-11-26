package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
     public void method1() {

         ArrayList<String> list1 = new ArrayList<String>();

         list1.add("새우깡");
         list1.add("맛동산");
         list1.add("포카칩");
         list1.add("고구마칩");
         list1.add("고래밥");

         System.out.println("list1에 들어있는 값 : "+list1);
         System.out.println("list1에 들어있는 값의 총 개수 : "+list1.size());

         //만약에 index 1자리에 허니버터칩을 넣고 싶다면 ->add(index자리넘버, 넣고자하는값)
         list1.add(1,"허니버터칩");
         System.out.println("list1에서 허니버터칩 추가 확인 : "+list1);
         //특정 위치의 값 가져오기 get(int index자리넘버)
         //3번째 작성된 값이 무엇인지 가져올 예정
         System.out.println("3번째 인덱스에 저장된 값 : "+list1.get(3));

         //2번째 저장된 값을 망고과자로 변경 set(index자리넘버, 넣을 값)
         list1.set(2,"망고과자");
         System.out.println("망고과자로 변경됐는지 확인 : "+list1);

         //특정 위치의 값을 삭제 remove("삭제할값") or remove(index자리값)
         list1.remove(1);
         System.out.println("index 1번 자리 값 삭제: "+list1);

         list1.remove("포카칩");
         System.out.println("포카칩이 무사히 사라졌는지 확인 : "+list1);

         //contains("값") or contains(index자리값) 리스트에 찾는 값이 들었는지 확인
         System.out.println("망고과자가 존재하나요? : "+list1.contains("망고과자"));

         //clear(); list안에 들어있는 모든 값 삭제
         list1.clear();
         System.out.println("리스트 안에 값이 깨끗하게 지워졌나요? : "+list1.isEmpty());

         //contains, isEmpty는 값이 boolean 값으로 나옴
     }

     public void method2() {
         ArrayList<String> list2 = new ArrayList<String>();

         list2.add("사과");
         list2.add("포도");
         list2.add("바나나");
         list2.add("망고");

         System.out.println("list2에 들어있는 값 : "+list2);

         list2.add(1,"오렌지");
         System.out.println("list2에서 오렌지 추가 확인 : "+list2);

         list2.set(3,"파인애플");
         System.out.println("파인애플로 변경됐는지 확인 : "+list2);

         list2.remove(0);
         System.out.println("index 첫 번째 과일 삭제: "+list2);

         list2.remove("망고");
         System.out.println("망고 삭제: "+list2);

         if(list2.contains("사과")) {
             list2.remove("사과");
             list2.remove("사과 삭제한 리스트 : "+list2);
         }else {
             System.out.println("사과는 존재하지 않음");
         }
         list2.clear();
         System.out.println("리스트 안에 값이 깨끗하게 지워졌나요? : "+list2.isEmpty());
     }

     public void method3() {
         //1.정수(int)타입 제한
         ArrayList<Integer>intList = new ArrayList<Integer>();
         intList.add(1);
         intList.add(20);
         intList.add(300);
         System.out.println("intList : "+intList);

         //2.문자(char)타입 제한
         ArrayList<Character>charList = new ArrayList<Character>();
         charList.add('a');
         charList.add('가');
         charList.add('b');
         charList.add('나');
         System.out.println("CharList : "+charList);

         ArrayList<Boolean>boolList = new ArrayList<Boolean>();
         boolList.add(true);
         boolList.add(false);
         System.out.println("boolList : "+boolList);

         ArrayList<Double>doubleList = new ArrayList<Double>();
         doubleList.add(1.5);
         doubleList.add(3.14);
         System.out.println("doubleList : "+doubleList);
     }
}
