package com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args) {

        A_if a = new A_if();
        /*단독 if 문 흐름 확인용 메소드 출력*/
        //a.testsimpleIfstatement();

        /*중첩된 if문 흐름 확인용 메소드 출력*/
        //a.testNextIfStatment();

        /*단독 if-elde문의 흐름ㅁ 확인용 메소드*/
        //B_ifElse b = new B_ifElse();
        //b.testsimpleIfElse();

        /*중첩 if-else문 흐름 확인용 메소드 호출*/
        B_ifElse b = new B_ifElse();
        b.testNeatedIfElseStatment();

        //C_ifElseif c = new C_ifElseif();
        //c.testSimpleIfElseIfStatement();

        //C_ifElseif c_ifElseif = new C_ifElseif();
        //c.tesstNestedIfElseIfStatment();


    }

}
