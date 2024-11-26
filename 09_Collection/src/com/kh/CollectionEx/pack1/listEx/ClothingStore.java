package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {

    //옷 추가 서비스
    private ArrayList<Clothing> clothList = new ArrayList<Clothing>();

    public void addClothing(String name, String categorty, String price) {
        Clothing c1 = new Clothing(name, categorty, price);
        clothList.add(c1);

        System.out.println(clothList);
        System.out.println("[" + name + "] 추가 완료!");
    }

    //추가된 옷 리스트들 확인하는 기능
    public void delClothing() {
        if (clothList.isEmpty()) {
            System.out.println("등록된 옷이 없습니다");
        } else {
            for (int i = 0; i < clothList.size(); i++) {
                System.out.println(clothList.get(i));
            }
        }
    }
}

