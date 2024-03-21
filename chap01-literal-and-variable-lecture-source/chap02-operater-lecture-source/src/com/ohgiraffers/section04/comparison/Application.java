package com.ohgiraffers.section04.comparison;

public class Application {
    public static void main(String[] args){
        /*비교 연산자에 대해 이해하고 활용할 수 있다.*/

        /*비교 연산자.
        * 비교 연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 상황 연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        * (충분한 연습이 필요)
        * */

        /*
        * 비교 연산자의 종류
        * '==' : 왼쪽 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환한다.
        * '!=' : 왼쪽 피연산자와 오른쪽 피연산자가 다르면 true 같으면 false를 반환한다.
        * '>' : 왼쪽 피연산자가 오른쪽 피연산자보다 크면 true 아니면 false를 반환한다.
        * '>=' : 왼쪽 피연산자가 오른쪽 피연산자보다 크거나 같으면 true 아니면 false를 반환한다.
        * '<' : 왼쪽 피연산자가 오른쪽 피연산자보다 작으면 true 아니면 false를 반환한다.
        * '<=' : 왼쪽 피연산자가 오른쪽 피연산자보다 작거나 같으면 true 아니면 false를 반환한다.
        * */

        /* 1. 숫자값 비교*/
        /*  1-1. 정수 비교*/
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("==================정수 값 비교===================");
        System.out.println("inum과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum과 inum2가 다른지 비교 : " + (inum1 != inum2));
        //위 두개는 조건식에서 많이 쓰임
        System.out.println("inum보다 inum2가 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum보다 inum2가 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum보다 inum2가 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum보다 inum2가 작거나 같은지 비교 : " + (inum1 <= inum2));

        /*  1-2. 실수 비교*/
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("==================실수 값 비교===================");
        System.out.println("dnum과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
        System.out.println("dnum과 dnum2가 다른지 비교 : " + (dnum1 != dnum2));
        System.out.println("dnum보다 dnum2가 큰지 비교 : " + (dnum1 > dnum2));
        System.out.println("dnum보다 dnum2가 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum보다 dnum2가 작은지 비교 : " + (dnum1 < dnum2));
        System.out.println("dnum보다 dnum2가 작거나 같은지 비교 : " + (dnum1 <= dnum2));

        /*2. 문자값 비교. */
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("==================문자 값 비교===================");
        System.out.println("char1과 char2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("char1과 char2가 다른지 비교 : " + (ch1 != ch2));
        System.out.println("char1보다 char2가 큰지 비교 : " + (ch1 > ch2));
        System.out.println("char1보다 char2가 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("char1보다 char2가 작은지 비교 : " + (ch1 < ch2));
        System.out.println("char1보다 char2가 작거나 같은지 비교 : " + (ch1 <= ch2));
        //아스키코드로 인식해서 비교하는 연산

        /*3. 논리값 비교*/
        /* ==과 !=은 비교가 가능하지만 대소 비교는 불가능*/
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 != bool2));

        /*4. 문자열의 값 비교*/
        /* 문자열도 비교 연산자가 가능하다.(==/!=)
        * 대소비교는 불가능*/
        String str1 = "java";
        String str2 = "java";
        System.out.println("==================문자열 값 비교===================");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 다른지 비교 : " + (str1 != str2));

        int x = 10;
        int y = 11;
        boolean result = x <= y;
        System.out.println(result);

    }
}
