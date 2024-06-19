package com.day10;

public class Main {
    public static void main(String[] args) {
        사람 사람1 = new 김철수("김철수");
        System.out.println("===사람1 정보==");
        System.out.printf("이름 : %s\n", 사람1.이름);
        System.out.printf("나이 : %d\n", 사람1.나이);

        사람 사람2 = new 사람();
        System.out.println("===사람2 정보==");
        System.out.printf("이름 : %s\n", 사람2.이름);
        System.out.printf("나이 : %d\n", 사람2.나이);

//        사람 사람3 = new 김철수();
//        System.out.println("===사람1 정보==");
//        System.out.printf("이름 : %s\n", 사람3.이름);
//        System.out.printf("나이 : %d\n", 사람3.나이);
    }
}
class 사람 {
    String 이름;
    int 나이;

    사람() {
        System.out.println("사람 생성자 호출됨");
        this.나이 = 22;
    }
}
// 1. 사람 타입의 사람1 변수를 생성하고 사람 클래스의 설계도 대로 객체를 생성과 동시에
//      생성자 메소드를 호출하며 이 생성자는 나이=22의 값을 가진채 호출된다.
//      생성자 메소드는 설계도 처럼 "이름"이라는 한개의 인자를 받는다.
// 2. "=== 사람1 정보 ==="를 출력한다.
// 3. 인수로 받은 데이터인 "김철수"를 객체 자신이 가지고 있는(This) 인스턴스 변수 "이름"에
//      데이터를 초기화 하고 출력한다.
// 4. 생성자가 선언됨과 동시에 가지고 있던 나이의 데이터 22를 그대로 출력한다.


class 김철수 extends 사람 {
    김철수() {
        System.out.println("김철수 생성자 호출됨");
        this.이름 = "김철수";
    }
    김철수(String 이름) {
        System.out.println("김철수 생성자 호출됨");
        this.이름 = 이름;
    }
}