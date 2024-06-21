package com.day12.example1;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
    public static void main(String[] args) {


        사람인력관리소1 a사람인력관리소1 = new 사람인력관리소1();

        a사람인력관리소1.add사람1("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소1.add사람1("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소1.add사람1("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람1 a사람1 = a사람인력관리소1.get사람1(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람1 a사람2 = a사람인력관리소1.get사람1(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람1 a사람3 = a사람인력관리소1.get사람1(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소1 extends 사람1{
    int lastuser = 0;
    사람1 user;

    public void add사람1(String name, int age) {
        사람1 a사람 = new 사람1();
        a사람.number = this.lastuser + 1;
        a사람.age = age;
        a사람.name = name;
        System.out.println("나이가 " +  age + "살인 " + a사람.number + name + "이 추가되었습니다.");

        user = a사람;
        this.lastuser = a사람.number;
    }

    사람1 get사람1(int number) {

        return  user;
    }

}

class 사람1 {
    int number;
    int age;
    String name;


    void 자기소개(){

        System.out.println("저는 " + number +  "번, " + name + ", " + age + "살 입니다.");
    }
}