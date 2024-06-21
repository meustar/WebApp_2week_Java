package com.day12.example4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 모니터 = 출력
        System.out.println();

        // 키보드 = 입력
        Scanner sc = new Scanner(System.in);

//        System.out.printf("숫자 : ");

//        int a = sc.nextInt();       // 입력을 받을 때 까지 대기중.
        // 숫자를 제대로 입력하기까지 유지하려면....\
        int a = 0;

        while (true){
            System.out.printf("숫자 : ");

            try {
//            int a = sc.nextInt();     // try문 안에 있기때문에 사용하지 못해서 밖으로 빼줘야함.
                a = sc.nextInt();
                sc.nextLine();          // catch의 무한루프에 빠졌을때, 버퍼를 비운다.1번
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();          // catch의 무한루프에 빠졌을때, 버퍼를 비운다.2번
                System.out.println("숫자만 입력해주세요."); // 프로세스가 종료된다면. 대기하는 cuntinue를 사용해야하는데.
                                                            // 컨티뉴는 반복문에서 제어하는 용도기 때문에.
                                                            // try문을 반복문으로 감싸서 사용할 수 있게 만든다.
            }
//            break;        // 숫자를 제대로 입력했을때 빠져나와야 한다.
        }

        System.out.printf("입력된 숫자 : %d\n", a);

        sc.close();         // 직접 꺼줘야 한다. 객체와의 관계를 끊는 방법. 입력을 더이상 받지 않을때.

    }
}
