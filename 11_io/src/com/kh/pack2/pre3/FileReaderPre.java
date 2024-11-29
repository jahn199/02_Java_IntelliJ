package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    //파일을 읽고 읽은 내용을 눈으로 확인
    //happyLunch.txt
    /*
    readTxt(String path, String fileName)

    @param path = 파일경로
    @param fileName = 파일이름
     */
    public void readTxt(String path, String fileName){
        try {
            FileReader fr = new FileReader(path+fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
