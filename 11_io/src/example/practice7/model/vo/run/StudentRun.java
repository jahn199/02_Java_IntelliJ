package example.practice7.model.vo.run;

import example.practice7.model.vo.Student;
import example.practice7.model.vo.StudentController;

public class StudentRun {
    public static void main(String[] args) {
        StudentController sc = new StudentController();


        System.out.println("==========학생 정보 출력==========");
        for (Student student : sc.printStudent()) {
            System.out.println(student);
        }


        System.out.println("==========학생 성적 출력==========");
        double[] scores = sc.avgScore();
        System.out.println("학생 점수 합계 : " + (int) scores[0]);
        System.out.println("학생 점수 평균 : " + scores[1]);


        System.out.println("==========성적 결과 출력==========");
        for (Student student : sc.printStudent()) {
            if (student.getScore() >= StudentController.CUT_LINE) {
                System.out.println(student.getName() + "학생은 통과입니다.");
            } else {
                System.out.println(student.getName() + "학생은 재시험 대상입니다.");
            }
        }
    }
}