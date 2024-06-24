package com.day13.example2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // 홀수를 걸러내는 일. 일반적.
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
        int rsArrLen = 0;
        for(int n : arr){
            if(n % 2 == 0) {
                rsArrLen++;
            }
        }
        int[] rsArr = new int[rsArrLen];
        int rsArrLastIndex = -1;
        for(int n : arr) {
            if(n % 2 != 0) {
                continue;
            }
            rsArr[++rsArrLastIndex] = n;
        }
        System.out.println(Arrays.toString(rsArr));


//        // 홀수를 걸러내는 일. 스트림(필터) -- 내 버전.
//        List<Integer> numbers = Arrays.asList(33, 2, 55, 4, 51, 6, 71, 18, 29, 10);
//        List<Integer> rsNum = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(rsNum);

        // 홀수를 걸러내는 일. 스트림(필터) -- 선생님 버전.
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        rsArr = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .toArray();

        System.out.println(Arrays.toString(rsArr));

    }
}
