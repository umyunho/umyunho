package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {
        /*수업목표: 변수의 값을 선언하고 값을 할당하여 사용할 수 있다.*/
        /*변수를 사용하는 방법
         * 1.변수를 선언한다.(선언)
         * 2.변수의 값을 대입한다.(값 대입 및 초기화)
         * 3.변수를 사용한다.
         * */

        /*자료형이란?
         * 다양한 값이 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 comlpiler와 약속한 키워드이다
         * 예)앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
         *   이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어 진다.
         *   그 중 기본자료형 8가지부터 살펴보기로한다.
         * */

        /*목차 1-1-1 숫자를 취급하는 자료형.*/
        /*정수를 취급하는 자료형에는 4가지가 있다.*/

        byte bnum;      //1byte
        short snum;     //2byte
        int inum;       //4byte
        long lnum;       //8byte

        /* 실수를 취급하는 자료형은 2가지가 있다.*/
        float fnum;     //4byte
        double dnum;    //8byte

        /* 목차 1-1-2 문자를 취급하는 자료형*/
        /* 문자를 취급하는 자료형은 한 가지가 있다.*/

        char ch;  //2byte
        char ch2;

        /* 목차 1-1-3 논리값을 취급하는 자료형*/
        boolean istrue;     //1byte

        /* 이상 8가지의 기본자료형이라고한다.*/

        /* 1-1-4 문자열을 취급하는 자료형*/
        String str;     //4byte (엄밀히 말하면 주소값은 4byte정수값)

        //주소값은 메모리에 할당된 값

        /*2.변수의 값을 대입한다.(값 대입 및 초기화)*/

        /* 목차 2-1. 정수를 취급하는 자료형에 값 대입*/
            //byte: -128 ~ 127
            //short: -32768 ~ 32767
            //
        bnum = 1;   //byte: -128 ~ 127
        snum = 2;   //short: -32768 ~ 32767
        inum = 3;   //int:-2147483648 ~ 2147483647
        lnum = 8l;
        //lnum = 8; //아무 문제 없을 것 같지만 뒤에 대문자 L을 붙여야한다.
        // long:-9223342036854775808 ~ 9223372036854775807

        /* 2-2 실수를 취급하는 자료형 값 대입*/
        //fnum = 4.0; float타입은 뒤에 f를 붙여줘야한다(대문자 소문자 상관x 소문자가 국룰).
        fnum = 4.0f;
        dnum = 8.0;

        /* 2-3 문자를 취급하는 자료형 값 대입*/
        ch = 'a'; //문자 형태의 값을 저장할 수 있다.
        ch2 = 97; //아스키코드에 관련된 숫자만 가능 'a' = 97.

        /* 2-4 논리를 취급하는 자료형에 값 대입*/
        istrue = true;
        istrue = false;

        /* 2-5 문자열을 취급하는 자료형에 값 대입*/
        str = "안녕하세요";

        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 한다.
        * 정수는 int 실수는 double가 대표적인 '대표 자료형'이다*/

        /*목차3 변수를 사용한다.*/
        /*변수에 저장한 값을 출력*/
        System.out.println("======================변수에 저장한 값을 출력=============================");
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);

        System.out.println("fnum의 값 출력 : " + fnum);
        System.out.println("dnum의 값 출력 : " + dnum);

        System.out.println("ch의 값 출력 : " + ch);
        System.out.println("ch2의 값 출력 : " + ch2);

        System.out.println("isTrue의 값 출력 : " + istrue);

        System.out.println("str의 값 출력 : " + str);








    }






}
