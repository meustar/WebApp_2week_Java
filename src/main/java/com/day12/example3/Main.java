package com.day12.example3;

// 4교시 배열을 사용해서 풀어보기.

// 클래스, 메서드, 문법들 등을 연습할수있는 문제.

// CRUD 중에서 C와 R 정도...

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정22", 32);
        // 나이가 30살인 4번째 사람(임꺽정)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정33", 33);
        // 나이가 30살인 5번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
        사람 a사람4 = a사람인력관리소.get사람(4);
        a사람4.자기소개();
        // 저는 4번, 임꺽정22, 32살 입니다.
        사람 a사람5 = a사람인력관리소.get사람(5);
        a사람5.자기소개();
        // 저는 5번, 임꺽정33, 33살 입니다.

    }
}


class 사람인력관리소 {
//    변수가 여러개

//    사람[] 사람들 = new 사람[5];   // -> 더 효율적인 ArrayList를 사용하자

//    List<사람> 사람들 = new ArrayList<>();   // 배열과 ArrayList의 차이점은.. 가변성!

    Map<Integer, 사람> 사람들 = new HashMap<>();

//    사람 a사람0;
//    사람 a사람1;
//    사람 a사람2;
//    사람 a사람3;
//    사람 a사람4;

    int 마지막_사람의_번호 = 0;

    void add사람(String 이름, int 나이) {
        int 번호 = 마지막_사람의_번호 + 1;
        사람 a사람 = new 사람();
        a사람.번호 = 번호;
        a사람.이름 = 이름;
        a사람.나이 = 나이;

//        사람들[번호 - 1] = a사람;          //insert []
//        사람들.add(a사람);                 //ArrayList
        사람들.put(번호, a사람);           //HashMap

//        if (번호 == 1) {
//            a사람0 = a사람;
//        } else if (번호 == 2) {
//            a사람1 = a사람;
//        } else if (번호 == 3) {
//            a사람2 = a사람;
//        } else if (번호 == 4) {
//            a사람3 = a사람;
//        } else if (번호 == 5) {
//            a사람4 = a사람;
//        }

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);
        마지막_사람의_번호++;
    }

    사람 get사람(int 번호) {
//        if (번호 == 1) {
//            return a사람0;
//        } else if (번호 == 2) {
//            return a사람1;
//        } else if (번호 == 3) {
//            return a사람2;
//        } else if (번호 == 4) {
//            return a사람3;
//        } else if (번호 == 5) {
//            return a사람4;
//        }
//        return 사람들[번호 - 1];           // select
//        return 사람들.get(번호 -1);        //ArrayList
        return 사람들.get(번호);             //HashMap
    }
}

class 사람 {
    int 번호;
    String 이름;
    int 나이;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.번호, this.이름, this.나이);
    }
}