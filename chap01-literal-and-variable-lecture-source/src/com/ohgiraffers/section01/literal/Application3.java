package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {



        /*수업 목표 문자열 합치기 결과를 예측하고 사용할 수 있다.*/
        /*목차1. 두 개의 문자열 합치기*/

        System.out.println("============두개의 문자열 합치기=============");
        System.out.println( 9 + 9 );   //18
        System.out.println( "9" + "9" ); //99
        System.out.println( "9" + 9 );
        System.out.println( 9 + "9" );
        //문자 열은 하나만 있어도 문자열 합치기의 값이 나온다.

        /*목차2.세 개의 문자열 합치기*/
        System.out.println("============세개의 문자열 합치기=============");
        System.out.println( "9" + 9 + 9 ); //999
        System.out.println( 9 + "9" + 9 ); //999
        System.out.println( 9 + 9 + "9" ); //189
        //왼쪽의 연산부터 수행하고 수행결과를 오른쪽과 연산함
        System.out.println( "9" + ( 9 + 9 ));
        //수학 계산과 같이 괄호 안의 연산을 먼저 수행

        /*목차3. 문자열 합치기 응용*/
        /*10과 20의 사칙 연산 결과를 출력하세여*/
        System.out.println("============10과 20의 사칙 연산=============");
        System.out.println( 10 + 20 );
        System.out.println( 10 - 20 );
        System.out.println( 10 * 20 );
        System.out.println( 10 / 20 );

        System.out.println("============10과 20의 사칙 연산을 보기 좋게 출력=============");
        System.out.println("10과 20의 합" + (10 + 20) ); // 괄호를 묶지 않으면 문자열 합치기가 되어서 결과가 1020이된다.
        System.out.println("10과 20의 차" + (10 - 20) ); // 문자열은 마이너스 연산이 불가능하기에 문자열과 마이너스는 연산이 불가능하다.
        System.out.println("10과 20의 곱" + (10 * 20) );
        System.out.println("10과 20의 나누기" + (10 / 20) );
        System.out.println("10과 20의 몫" + (10 % 20) );

        System.out.println("기차"); //기차
        System.out.println("기차" + "칙칙폭폭"); //기차칙칙폭폭
        System.out.println("기차" + 123 + 45 + "칙칙폭폭"); //기차12345칙칙폭폭
        System.out.println(123 + 45 + "기차" + "출발"); //168기차출발

    }
}
