package com.day11.example4;

public class Main {
    public static void main(String[] args) {
        String s1 = "하하";
        String s2 = "하하";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("s1 == s2 : " + (s1 == s2));       // 리모콘의 주소값
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  // 객체끼리의 비교는 equals() 메소드를 사용하여 값을 비교한다.
        // String s1 = "문장"; 과 String s1 = new String("문장");은 다르다.
        // 기존의 객체를 재활용 -> 메모리 절약
        // 각자 다른 새로운 객체를 생성하게 되면.. 재활용을 하지 못해 절약이 안된다.

        Person p1 = new Person(13);
        Person p2 = new Person(13);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1.equals(p2) :" + p1.equals(p2));

        // String 불변성
        //StringBuilder

        String s = "*";
        String k = "*";
        // 서로 같은 String "*"을 가르킨다.
        s += "*";
        // 새로운 별 "**"인 객체를 생성해 가르킨다.
        s += "*";
        // 다시 새로운 별 "***"을  생성해 가르킨다. 이때 새로운 별을 찍어만들면서 메모리 용량을 차지하게 된다.
        s += "*";

        System.out.println(s);      // ****
        System.out.println(k);      // *

        // 이런 메모리의 낭비를 줄이기 위해서 StringBuilder를 사용한다.
        StringBuilder sb = new StringBuilder();
        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        System.out.println(sb.toString()); // ****


    }
}
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
