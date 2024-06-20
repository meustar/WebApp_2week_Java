package com.day11.example2;

public class Main {
    public static void main(String[] args) {
        int rs = 계산기.나누다(15,0);
        System.out.println(rs);
        System.out.println(123);
    }
}
class 계산기 {
    static int 나누다 (int a, int b) throws ArithmeticException{
        int rs = 0;

//        rs = a / b;

        try {
            rs = a / b;
            return rs;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없다.");
            return 0;
        }

//        return rs;
    }

}