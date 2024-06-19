package com.ki;

////----------------------------------------------------------------

////올바른 리턴타입으로 메서드를 만들어주세요
//public class Main {
//    public static void main(String[] args) {
//        int i = 로봇.get정수();
//        boolean b = 로봇.get논리();
//        사람 a사람 = 로봇.get사람();
//        사람 a사람2 = 로봇.get사람2();
//        사람 a사람3 = 로봇.get사람3();
//        사람 a사람4 = 로봇.get사람4();
//        사람 a사람5 = 로봇.get사람5(123, false);
//        로봇.get사람6(123, false);
//
//    }
//}
//
//class 로봇 extends 사람 {
//    static int get정수() {
//        return 0;
//    }
//
//    static boolean get논리() {
//        return true;
//    }
//
//
//    static 사람 get사람() {
//
//        return null;
//    }
//
//    static 사람 get사람2() {
//        return new 사람();
//    }
//
//    static 사람 get사람3() {
//        사람 a사람 = null;
//        return a사람;
//    }
//
//    static 사람 get사람4() {
//        사람 a사람 = new 사람();
//        return a사람;
//    }
//
//    static 사람 get사람5(int 나이, boolean 기혼여부) {
//        사람 a사람 = new 사람();
//        a사람.나이 = 나이;
//        a사람.기혼여부 = 기혼여부;
//        return a사람;
//    }
//    static void get사람6(int 나이, boolean 기혼여부) {
//    }
//}
//
//class 사람 {
//    int 나이;
//    boolean 기혼여부;
//}

////--------------------------------------------------------------------------------------------\
//// 문제 : 아래가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//
//        a사람.a왼팔 = new 팔();
//        a사람.a왼팔.길이 = 100;
//    }
//}
//
//class 사람 {
//    // 클래스안에 변수를 정의 할 수 있다.
//    int 나이;
//    팔 a왼팔;
//}
//
//class 팔 {
//    int 길이;
//}

////--------------------------------------------------------------------------------------------
//// 문제 : 아래가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();
//    }
//}
//
//class 전사 {
//    int 나이;
//    무기 a무기; // 활과 칼을 모두 만족하는 상위개념의 무기 클래스가 필요함.
//}
//class 활 extends 무기 {
//
//}
//class 칼 extends 무기 {
//
//}
//class 무기 {
//
//}
//
////----------------------------------------------------------------------------------------
//
//// 문제 : 아래가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.나이 = 30;
//        a전사.이름 = "카니";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.이름 = "철수";
//        a전사.공격();
//        // 출력 : 카니가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//
//    void 공격() {
////        System.out.println("카니가" + a무기 + "로 공격합니다.");
//        a무기.작동(this.이름);
//    }
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//}
//
//abstract class 무기 {
//    abstract void 작동(String 공격자이름);     // 추상 메서드
//
////    void 방어() {
////
////    }
//}
//
//class 칼 extends 무기 {
//    void 작동(String 공격자이름){
//        System.out.println(공격자이름 + "가 칼로 공격합니다.");
//    }
//}
//
//class 활 extends 무기 {
//    void 작동(String 공격자이름){
//        System.out.println(공격자이름 + "가 활로 공격합니다.");
//    }
//}

////----------------------------------------------------------------------------------------
//
// 아래의 코드가 실행되도록 해주세요

class day10 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "진";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        //출력 : 진이 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        //출력 : 진이 칼로 공격합니다.
    }
}

class 전사 {
    //인스턴스 변수
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.공격자명 = 이름;
        a무기.작동();
    }

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
}

class 무기 {
    String 공격자명;

    void 작동(){}
}

class 칼 extends 무기 {
    void 작동(){
        System.out.println(공격자명 + "이 칼로 공격 합니다.");
    }
}

class 활 extends 무기 {
    void 작동(){
        System.out.println(공격자명 + "이 활로 공격 합니다.");
    }
}


