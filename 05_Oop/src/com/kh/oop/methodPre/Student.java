package com.kh.oop.methodPre;

public class Student {
    //필드 = 속성 =멤버변수 = 전역변수(클래스 내 전국지역에서 쓰이는 변수)
    //학생의 이름, 나이, 학년, 전공
    private String name;
    private int age;
    private String gender;
    private String major;

    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //Getter


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }
}
