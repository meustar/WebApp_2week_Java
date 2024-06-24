package com.day13.example1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 12일차 마지막교시 "60강 꼬마정민 다시듣기"

//        문제
//        꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//
//        입력
//        첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//
//        출력
//        A+B+C의 값을 출력한다.
//
//        예제 입력 1
//        77 77 7777
//
//        예제 출력 1
//        7931

        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        // 스트림 이용
        long sum = Arrays.stream(inputs)
//                .peek(e -> System.out.println(e)) // e의 요소를 출력해본다.
                .mapToLong(e -> Long.parseLong(e))// e 는 요소 하나하나 (숫자로 바뀌는 대상)       // " -> " 함수를 실행한다는 의미.
                .sum();

//        long sum = 0;
//        for (String inputData : inputs) { // 향상된 for문 // ^ 위의 스트림은 한번에 (많이 축약되서 끝난다.)
//            sum += Long.parseLong(inputData);
//        }


        System.out.println(sum);

        sc.close();

    }
}
