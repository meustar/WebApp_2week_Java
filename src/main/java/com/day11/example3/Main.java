package com.day11.example3;

public class Main {
    public static void main(String[] args) {
        System.out.println((int)'ㄱ');
        System.out.println((int)'ㅎ');
        System.out.println((int)'ㅏ');
        System.out.println((int)'ㅣ');
        System.out.println((int)'가');
        System.out.println((int)'힣');

        System.out.println(isHanguel('안'));
        System.out.println(isHanguel('녕'));
        System.out.println(isHanguel('A'));
        System.out.println(isHanguel('.'));
        System.out.println(isHanguel(' '));
//        System.out.println(isHanguel(''));
    }

    static boolean isHanguel(char c) {
        return c >= '가' && c <='힣';
    }
}
