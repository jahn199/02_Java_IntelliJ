package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre3 {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        File file = new File(path + "menu.txt");

     try {
         if (file.exists()) {
             System.out.println("파일이 이미 존재함");
             return;
         } else {
             file.createNewFile();
             System.out.println("파일이 생성됨");
         }
     } catch(IOException e) {
         System.out.println("파일 만들기 실패");
         return;
     }

     try {
         FileWriter wow = new FileWriter(file, true);
         String content = "양식 \n 한식 \n 중식 \n 일식";
         wow.write(content);
         wow.close();
         System.out.println("글 작성 완료");
     } catch (IOException e) {
         System.out.println("이어서 작성하는 것을 실패함");
     } finally {
         System.out.println("프로그램 종료");
     }
    }
}
