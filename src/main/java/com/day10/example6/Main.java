package com.day10.example6;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
        List<Integer> ages2 = new ArrayList<>();
        ages2.add(20);  // index : 0
        ages2.add(22);
        ages2.add(33);

//        ages2.remove(1);
//        ages2.add(1,55);
//        ages2.remove(ages2.size() -1);
        System.out.println("철수 나이: " + ages2.get(0));
        System.out.println("영희 나이: " + ages2.get(1));
        System.out.println("영수 나이: " + ages2.get(2));

        // List는 넣을 때 좋지만. 가져올 때 귀찮다.
    }
}

class Ages {
    int 철수_나이;
    int 영희_나이;
    int 영수_나이;
}
