package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*scanner nextLine()과 */

        /*
        * nextLine() : 공백을 포함한 한 줄 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다.
        * next() : 공백 문자나 기행문자 전까지를 읽어서 문자열로 반환한다.(공백 문자부터는 포함하지 않는다.)
        * */

        /* Scanner 객체 생성*/
        Scanner sc = new Scanner(System.in);

        /* 문자열 입력 */
        /*  2-1. nextLine()*/
        System.out.println("인삿말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();
        System.out.println((greeting1));

        System.out.println("인삿말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println((greeting2));
    }

}
