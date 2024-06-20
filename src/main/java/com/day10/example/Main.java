package com.day10.example;

public class Main {
    public static void main(String[] args) {

        int lastId = 0;

//        Article article1 = new Article();
//        Article article2 = new Article();
        Article[] articles = new Article[10];   // 글을 담을 서류폴더
        articles[0] = new Article();
        articles[1] = new Article();
        articles[2] = new Article();

        for (int i = 0; i < 3; i++) {
            System.out.println(articles[i].id);
        }

        System.out.println(articles[0].id);
        System.out.println(articles[1].id);
        System.out.println(articles[2].id);

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
//        this(lastId)
        lastId++;
        this.id = lastId;
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }


}