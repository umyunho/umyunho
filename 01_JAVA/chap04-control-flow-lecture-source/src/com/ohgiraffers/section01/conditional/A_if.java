package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        /* 수업목표. if 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* [if문 표현식]
         * if(조건식) {
         *       조건식이 true일 때 실행할 명령문;
         * }
         * */

        /* 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
         * if문은 조건식 결과 값이 참(true)이면 {}안에 코드를 실행하고,
         * 조건식의 결과 값이 거짓(false)이면 {}안에 코드를 무시하고 넘어감
         * */

        /*
         * 정수 한 개를 입력 받아 그 수가 짝수이면 입력하신 숫자는 짝수입니다라고 출력하고,
         * 짝수가 아니면 출력하지 않는 구문을 만들어보다
         * 단 조건과 관련없이 프로그램이 종료될 때 프로그램을 종료합니다 라고 출력되도록 하자.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램이 종료합니다.");

    }

    /*자체 이해도
    * Scanner는 라이브러리에 저장된 클래스이다.
    * 25번째 줄을 해석하면 Scanner이라는 클래스를 sc라는 변수로 선언하고 sc변수는 Scanner의 인스턴스를 포함한다.
    * (System.in)을 해석하면 Scanner 인스턴스 안에 System이라는 다른 클래스를 포함시키고 System 클래스 안의 in이라는 메소드를 호출한다.
    * 27번째 num이라는 정수형 변수는 위에 25번재에 선언한 sc변수 안에 포함된 Scanner클래스에 있는 nextInt 메소드를 가진다.*/

    public void testNestedIfStatment(){

        /*수업목표. 중첩된 if문의 흐름을 이해하고 적용할 수 있다*/
        /* 중첩된 if문 실행 흐름 확인 */

        /* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다"라고 출력하고
        * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
        * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다"라고 출력 되도록 한다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0){

            if(num % 2 ==0){

                System.out.println("입력하신 숫자는 양수이면서 짝수입니다");
            }

        }

        System.out.println("프로그램을 종료합니다.");

    }




}
