package com.ohgiraffers.section02.userexception;


public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnoughMoney(30000,50000); // 정상작동
            //et.checkEnoughMoney(-50000,10000);    //에러
            //et.checkEnoughMoney(50000,-60000);
            et.checkEnoughMoney(50000,40000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
