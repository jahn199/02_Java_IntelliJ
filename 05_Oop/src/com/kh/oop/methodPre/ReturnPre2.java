package com.kh.oop.methodPre;

public class ReturnPre2 {

    public String introduce(String name, int age) {
        return "안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }

    public String compare(int num1, int num2) {
        if (num1 > num2) {
            return num2 + "보다 " + num1 + "가 큰 숫자입니다.";
        } else {
            return num1 + "보다 " + num2 + "가 큰 숫자입니다.";
        }
    }

    public char classify(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public String cost(int original, int discount) {
        int discountprice = (original - original * discount / 100);
        return "원래 가격: " + original + "원 할인율: " + discount + "% 최종 금액: " + discountprice + "원";
    }

    public String just(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        return "배열: " + numbers + " 평균값: " + average;
    }

    public String check(int age) {
        String result = (age >= 19) ? "성인입니다." : "미성년자입니다.";
        return "나이 : " + age + " 결과 : " + result;
    }

    public String add(String word1, String word2) {
        return word1 + "," + word2;
    }

    public String fruits(String[] fruits1, String fruits2) {
        boolean found = false;
        for (String item : fruits1) {
            if (item.equals(fruits2)) {
                found = true;
                break;

            }
        }
            if (found) {
                return "배열에 " + fruits2 + "이(가) 존재합니다.";

            } else {
                return "배열에 " + fruits2 + "이(가) 존재하지 않습니다.";
            }
        }


        public String toString(double radius) {
            double area = Math.PI * radius * radius;
            return "반지름: " + radius + " 원의 넓이: " + area;
        }
    }
















