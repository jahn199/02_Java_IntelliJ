package com.kh.oop.methodPre;

public class VoidPre {
    //메서드1: 온도 변화 확인하기
    //출력 : 섭씨 25도는 화씨 77.0도입니다
    public void method1(double celsius){
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("섭씨"+celsius+" 도는 화씨"+fahrenheit+"입니다.");
    }

    public void method2(String name){
        System.out.println("학생 이름:"+name);
    }

    public void method3(String product, double price){
        System.out.println("상품명:"+product + ",가격 : "+ price + "원");
    }

    public void method4(int hours,int minutes){
        int totalMinutes = hours * 60 + minutes;
        System.out.println("총 "+totalMinutes+"분입니다");
    }

    public void method5(String exercise, int time){
        System.out.println("운동:"+exercise+", 지속 시간:"+time+"분");
    }

    public void method6(String number, double price){
        System.out.println("계좌번호:"+number+", 잔액: "+ price+"원");
    }

    public void method7(String movie, double score){
        System.out.println("영화 제목:"+movie+", 평점:"+score+"/10");
    }

    public void method8(String car, double speed){
        System.out.println("차량명:"+car+", 최고 속도:"+speed+"km/h");
    }

    public void method9(String email, String title){
        System.out.println("수신자:"+email+", 제목:"+title);
    }

    public void method10(String item, int count){
        System.out.println("상품명:"+item+", 수량:"+count+"개");
    }
}




