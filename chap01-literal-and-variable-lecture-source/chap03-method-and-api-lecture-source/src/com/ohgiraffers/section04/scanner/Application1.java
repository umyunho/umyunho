package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        //API = 자바에서 구현해둔걸 가져다 쓰는것
        /*수업 목표. java,util,scanner을 이용한 다양한 자료형 값 입력 받기*/

        /*
        * 1. scanner  객체 선언
        *   1-1. 원래 이렇게 scanner 객체를 만들어야 한다. java.lang 라는 부분은 생략 가능
        * */
            //java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

            /* 1-2. 다른 클래스에 클래스 사용 시 패키지명 생략하기 위해 사용(impot)*/

        Scanner sc = new Scanner(System.in);

        /* 자료형 값 입력 받기 */

        /*
        * 이름을 입력하세요 : xxxx이 맞지 아랫줄에 이름이 적히는건 이상하기 때문에 println 보다 print를 사용*/

        /*  2-1. 문자열 입력 받기 */
        /* nextLine() : 입력 받은 값을 문자열로 변환해줌*/
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /*  2-2. 정수값 입력 받기 */
        /* nextInt() : 입력받은 값을 int형으로 변환한다.*/
        //nextByte , nextShort는 생략 : 딱히 잘 사용하지도 않는다.

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 : " + age + "입니다.");

        /* 2-3 실수값 입력받기 */
        /* nextDouble() : 입력 받은 값을 double로 변환*/

        System.out.print("원하는 실수를 입력해주세요, : ");

        double num = sc.nextDouble();

        System.out.println("입력하신 실수는 : " + num + "입니다.");

        /* 2-4. 논리형 값 입력 받기*/
        /* nextBoolean() : 입력받은 값을 boolean으로 변환시켜준다.*/
        System.out.print("참과 거짓 중 한가지를 true or false로 입력해주세요.");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 : " + isTrue + "입니다.");

        /*2-5. 문자형 값 입력하기*/
        /* charAt(int index)를 사용한다.*/
        sc.nextLine();
        System.out.print("아무 문자나 입력해주세요 : " );
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는" + ch + "입니다.");



    }
}
