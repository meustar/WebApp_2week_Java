package com.day12.example3;

// 4교시 배열을 사용해서 풀어보기.

class 사람인력관리소 {
    사람 a사람0;
    사람 a사람1;
    사람 a사람2;
    사람 a사람3;

    int 마지막_사람의_번호 = 0;

    void add사람(String 이름, int 나이) {
        int 번호 = 마지막_사람의_번호 + 1;
        사람 a사람 = new 사람();
        a사람.번호 = 번호;
        a사람.이름 = 이름;
        a사람.나이 = 나이;

        if (번호 == 1) {
            a사람0 = a사람;
        } else if (번호 == 2) {
            a사람1 = a사람;
        } else if (번호 == 3) {
            a사람2 = a사람;
        } else if (번호 == 4) {
            a사람3 = a사람;
        }

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);
        마지막_사람의_번호++;
    }

    사람 get사람(int 번호) {
        if (번호 == 1) {
            return a사람0;
        } else if (번호 == 2) {
            return a사람1;
        } else if (번호 == 3) {
            return a사람2;
        } else if (번호 == 4) {
            return a사람3;
        }
        return null;
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