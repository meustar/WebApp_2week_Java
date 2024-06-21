package com.day12.example2;

// 선생님 문제 풀이
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);    // 이자리에 리턴받는 값은 무엇인가?!
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
class 사람인력관리소 {

    사람 a사람0;
    사람 a사람1;
    사람 a사람2;

    int lastUserNumber = 0;


    void add사람 (String name, int age) {
//        int 사람1_number = 1;
//        String 사람_name = name;
//        int 사람_age = age;
//        int lastUserNumber = 1;  출력하고나면 수명이 끝나기 때문에 같은 "1"만 반복되므로 전역변수로 빼야한다.

        int number = lastUserNumber + 1;
        사람 a사람 = new 사람();
        a사람.name = name;
        a사람.age = age;

        if (number == 1) {
            a사람0 = a사람;
        } else if (number == 2) {
            a사람1 = a사람;
        } else if (number == 3) {
            a사람2 = a사람;
        }

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, number, name);
        lastUserNumber ++;
    }

    사람 get사람(int number) {
        if (number == 1) {
            return a사람0;
        } else if (number == 2) {
            return a사람1;
        } else if (number == 3) {
            return a사람2;
        } else {
            return null;
        }

//        return new 사람();        // 42강에 같은개념의 문제가 있음.
    }
}

class 사람 {
    int number;
    int age;
    String name;

    void 자기소개(){
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.number, this.name, this.age);
    }
}

