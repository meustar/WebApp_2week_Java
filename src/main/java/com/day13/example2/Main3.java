package com.day13.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        int[] arr= {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        List<Integer> resultAl = new ArrayList<>();

        // filter
        for (int n : arr) if (n % 2 == 0) resultAl.add(n);

        // map
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        System.out.println(resultAl);


        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultAl = Arrays.stream(arr)       // 강점 -> 잘 읽힌다. 가독성의 장점이 부각된다.
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .boxed()    // new Integer
                .collect(Collectors.toList());

        System.out.println(resultAl);
    }
}
