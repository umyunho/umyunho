package com.ohgiraffers.section05.logical;

import java.sql.SQLOutput;

public class Application1 {
    public static void main(String[] args) {
        /*수업 목표: 논리 연산자에 대해 이해하고 활용할 수 있다.*/
        /*
        * 논리 연산자
        * 논리값 ( true or false)만 취급하는 연산자이다.
        *
        * 논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두개의 피연산자를 가지는 이항 연산자, 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        *                     두개의 논리 식을 판단하며 참과 거짓을 판단한다.
        *   1-1 &&(논리AND) 연산자: 두 개의 논리식이 모두 참일 경우 참을 반환한다. 둘 중 한개라도 거짓인 경우 거짓을 반환하는 연산자.
        *   1-2 ||(논리OR) 연산자: 두 개의 논리식 중 둘 중 하나라도 참인 경우 참을 반환 둘 다 거짓인 경우 거짓을 반환하는 연산자이다.
        * 2. 논리 부정 연산자: 피연산자가 하나인 단항연산자로, 피 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        *   2-1. !(논리NOT) 연산자: 논리의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
        * */

        /*논리 연산자의 결과값 확인*/
        System.out.println("true와 true의 and 연산 : " + (true && true));
        System.out.println("true와 false의 and 연산 : " + (true && false));
        System.out.println("false와 true의 and 연산 : " + (false && true));
        System.out.println("false와 false의 and 연산 : " + (false && false));

        System.out.println("===================================================");
        System.out.println("true와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true와 false의 논리 or 연산 : " + (true || false));
        System.out.println("false와 true의 논리 or 연산 : " + (false || true));
        System.out.println("false와 false의 논리 or 연산 : " + (false || false));

        /*2. 논리식에 논리연산자 활용*/

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("===================================================");
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));

        System.out.println("===================================================");
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b && c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b && c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b && c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b && c > d));





    }
}
