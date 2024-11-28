package example.practice7.model.vo;

import java.util.Scanner;

public class StudentController {

    public StudentController() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 학생 정보 출력 ======");
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("===== 학생 성적 출력 ======");
        System.out.println("과목 : ");
        String subject = sc.nextLine();
        System.out.println("===== 성적 결과 출력 ======");
        System.out.println("점수 : ");
        int score = sc.nextInt();


    }

    public void printStudent() {
        Student s1 = new Student ("김길동", "자바", 100);
        Student s2 = new Student ("박길동", "디비", 50);
        Student s3 = new Student ("이길동", "화면", 85);
        Student s4 = new Student ("정길동", "서버", 60);
        Student s5 = new Student ("홍길동", "자바", 20);
    }

    public int sumScore() {

    }

    public double avgScore() {

    }
}
