package com.ohgiraffers.section05.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /* java.util.calendar 클래스 사용법을 이해하고 사용할 수 있다.*/
        /*
         * API문서를 살펴보면 Calender클래스는 abstract클래스로 작성되어있다.
         * 따라서 Calendar클래스를 이용해서 인스턴스를 생성하는 것은 불가능하다.
         * */

        /*  Calendar 클래스를 이용한 인스턴스 생성 방법에는 크게 두가지가 있다.
         * 1. getInstance() static메소드를 이용해서 인스턴스를 생성하는 방법
         * 2. 후손 클래스의 GregorianCalendar클래스를 이용하여 인스턴스를 생성하는 방법
         * */

        /*1. getInstance() static메소드를 이용해서 인스턴스를 생성하는 방법*/
        Calendar calendar = Calendar.getInstance();

        System.out.println("calendar = " + calendar);

        /*2. 후손 클래스의 GregorianCalendar클래스를 이용하여 인스턴스를 생성하는 방법*/
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println("gregorianCalendar = " + gregorianCalendar);

        int year = 2024;
        int month = 8;  //0월부터 11월 까지 사용
        int dayOfMonth = 10;
        int hour = 16;
        int min = 42;
        int second = 0;

        Calendar birthday = new GregorianCalendar(year, month,dayOfMonth,hour,min,second);

        System.out.println("birthday = " + birthday);

    }


}
