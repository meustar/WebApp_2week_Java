package com.day10.example;

public class Main {
    public static void main(String[] args) {

        int lastId = 0;

        Article article1 = new Article();
        System.out.println(article1.id);

        Article article2 = new Article();
        System.out.println(article2.id);

    }
}
class Article {

    static int lastId;
    // static = 객체의 인스턴스 변수가 아니라 클래스 내부의 변수.
    // 공공재 의미.

    // static 전용 생성자 - 프로그램 시작할때 실행됨.
    static {
        lastId = 0;
    }

    int id;
    String regDate;

    Article() {
        lastId++;
        this.id = lastId;
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }


}