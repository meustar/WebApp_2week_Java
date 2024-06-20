package com.day10.example6;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        // 철수나이 20
        // 영희나이 22
        // 영수나이 33

        // 변수로 각각 따로따로 담기
        int 철수나이 = 20;
        int 영희나이 = 22;
        int 영수나이 = 33;

        // 배열로 한꺼번에 넣기
        int[] ages = new int[3];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 33;

        // 사용자 설정의 객체를 만들어서 넣기.
        Ages ages1 = new Ages();
        ages1.철수_나이 = 20;
        ages1.영희_나이 = 22;
        ages1.영수_나이 = 33;

        //
//        Map<String, Integer> agesMap = new HashMap<>();
        HashMap<String, Integer> agesMap = new HashMap<>();
        agesMap.put("철수", 20);  // index : 철수(key)
        agesMap.put("영희", 22);
        agesMap.put("영수", 33);


        System.out.println("철수 나이: " + agesMap.get("철수"));
        System.out.println("영희 나이: " + agesMap.get("영희"));
        System.out.println("영수 나이: " + agesMap.get("영수"));

        // Map은 넣을 때 귀찮지만. 가져올 때 좋다.
    }
}
