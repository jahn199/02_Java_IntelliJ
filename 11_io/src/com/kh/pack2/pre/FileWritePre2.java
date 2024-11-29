package com.kh.pack2.pre;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {

    //바탕화면 lunch.txt
    //먹고싶은 점심메뉴 리스트를 줄바꿈을 이용해서 작성하고
    //파일이 존재한다면 이미 존재합니다 와 동시에 프로그램 return으로 종료
    // main() 메서드 작성

    public static void main(String[] args) {

        String path = System.getProperty("user.home")+"/Desktop/";
        File file = new File(path + "lunch.txt");

    try {
        if (file.exists()) {
            System.out.println("파일이 이미 존재함");
            return;
        } else {
            file.createNewFile();
            System.out.println("파일이 새로 생성됨");
        }
    } catch(IOException e) {
        System.out.println("파일 만들기 실패");
        return;
    }

    try {
    FileWriter lunch = new FileWriter(file);
    String content = "짬뽕 \n 마파두부 \n 삼선볶음밥";
    lunch.write(content);
    lunch.close();
    System.out.println("글 작성 완료");
    } catch (IOException e) {
        System.out.println("글자 작성 실패. 다시 시도하세요");
    } finally {
        System.out.println("프로그램을 종료합니다.");
    }
    }
}
