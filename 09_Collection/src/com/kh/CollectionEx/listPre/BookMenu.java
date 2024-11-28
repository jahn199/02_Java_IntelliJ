package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.println("== Welcome KH Library ==");
            System.out.println("******* 메인 메뉴 ******");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");

            switch (choice) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    break;
            }

            public void insertBook() {
                System.out.print("도서명 입력: ");
                String title = sc.nextLine();

                System.out.print("저자명 입력: ");
                String author = sc.nextLine();

                System.out.println("장르 입력 (1.인문 / 2.자연과학 / 3.의료 / 4.기타): ");
                int category = sc.nextInt();

                System.out.print("가격 입력: ");
                int price = sc.nextInt();

                Book b = new Book();

                public void selectList () {
                    if (books.size() > 0) {
                        System.out.println("존재하는 도서가 없습니다.");
                    } else {
                        System.out.println("=== 도서 전체 조회 ===");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println(books.get(i).toString());
                        }
                    }
                }

                public void searchBook (String title){
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getTitle().equals(title)) {
                            System.out.println(books.get(i).toString());
                        } else {
                            System.out.println("검색 결과가 없습니다.");
                        }
                    }
                }

                public void deleteBook (String title){
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getTitle().equals(title)) {
                            books.remove(i);
                            System.out.println("성공적으로 삭제되었습니다.");
                        } else {
                            System.out.println("삭제할 도서를 찾지 못했습니다.");
                        }
                    }
                }
            }
        }
    }
}