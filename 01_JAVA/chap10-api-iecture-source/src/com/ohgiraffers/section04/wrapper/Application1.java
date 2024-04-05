package com.ohgiraffers.section04.wrapper;

import java.nio.IntBuffer;

public class Applicstion1 {
    public static void main(String[] args) {
        /* 수업 목표. Wrapper클래스에 대해 이해할 수 있다.*/
        /*
        * 상황에 따라 기본타입의 데이터를 인스턴스화 해야하는 경우가 발생한다.
        * 이때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야하는데
        * 8가지의 해당하는 기본타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스(warapper)라고한다
        * (두방에서 사용하는 랩(wrap)와 같은 형태로 감싼다는 뜻이다.
        * */

        /*
        * 기본 타입     래퍼 클래스
        *  byte          Byte
        *  short        Short
        *  int            Int
        *  long         Long
        * float         Float
        * double        Double
        * char          Char
        * boolean       Boolean
        * */

        /* 박싱(boxing)과 언박싱(unboxing)
        * 기본타입을 래퍼런스의 인스턴스로 인스턴스화 하는 것을 박싱이라고 하며
        * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱이라고한다.
        * */

        int intValue = 20;
        Integer boxingNum1 = new Integer(intValue);  //인스턴스화 ->박싱 //생성자 이용
        Integer boxingNum2 = Integer.valueOf(intValue);  //Static메소드를 이용

        int unBoxingNum1 = boxingNum1.intValue();       //언박싱 //int value()메소드 이용

        /*
        * 오토 박싱(auto boxing)과 오토 언박싱(auto unboxing)
        * JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
        * 이런 자동화된 박싱과 언박싱을 오토박싱, 오토 언박싱이라고 부른다.
        * */

        Integer boxingNum3 = intValue;      //오토 박싱
        int unBoxingNum3 = boxingNum3;      //오토 언박싱

        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 배교 : " + (inum == integerNum1));
        System.out.println("int와 Integer 배교 : " + (inum == integerNum3));
        System.out.println("Integer와 Integer 배교 : " + (integerNum1 == integerNum2));
        System.out.println("Integer와 Integer 배교 : " + (integerNum4 == integerNum3));

        System.out.println("equals() : " + (integerNum1.equals(integerNum2)));
        System.out.println("equals() : " + (integerNum1.equals(integerNum3)));
        System.out.println("equals() : " + (integerNum3.equals(integerNum4)));
        System.out.println("equals() : " + (integerNum2.equals(integerNum2)));

        System.out.println("valueOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));

    }
}
