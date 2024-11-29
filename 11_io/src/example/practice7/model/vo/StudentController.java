package example.practice7.model.vo;

import java.util.Scanner;

public class StudentController {
    private Student[] List = new Student[5];
    public static final int CUT_LINE=60;

    public StudentController() {
        List[0] = new Student ("김길동", "자바", 100);
        List[1] = new Student ("박길동", "디비", 50);
        List[2] = new Student ("이길동", "화면", 85);
        List[3] = new Student ("정길동", "서버", 60);
        List[4] = new Student ("홍길동", "자바", 20);
    }

    public Student[] printStudent() {
        return List;
    }

    public int sumScore() {
        int sum = 0;
        for (Student student : List) {
            sum += student.getScore();
        }
        return sum;
    }

    public double[] avgScore() {
        double[] result = new double[2];
        int sum = sumScore();
        result[0] = sum;
        result[1] = sum / 5.0;
        return result;
    }
}