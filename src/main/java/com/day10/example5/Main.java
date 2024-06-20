package com.day10.example5;

public class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("김철수", 22);
        사람 a사람2 = new 사람("홍길동", 23);

        System.out.println(a사람1);
//        System.out.printf("이름 : %s, 나이 : %d\n", a사람1.name, a사람1.age);
        System.out.println(a사람2);
    }
}

class 사람 extends Object {
    String name;
    int age;

//    @Override   // @ at sign = (스프링)어노테이션 = 주석
//    public String toString() {
//        return "사람[이름 = " + name + ", 나이 = " + age + "]";
//    }


    @Override
    public String toString() {
        // 객체가 문장으로서 취급되어야 할때 자바에서 알아서 호출해준다.
        return "사람{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    사람(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
