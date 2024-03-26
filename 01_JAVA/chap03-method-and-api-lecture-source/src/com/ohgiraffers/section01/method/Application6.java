package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*메소드 리턴값을 이해하고 활용할 수 있다*/
        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때 그냥 복귀할 수도 있지만 값을 가지고 복귀할 수도 있다.
        * 이때 가지고 가는 값을 리턴값이라고 한다.
        * */

        /*
        * return값을 반환받기 위해서는 메소드 선언부에 리턴타입을 명시해 주어야한다
        * void는 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다.
        * 반환값이 없는 경우 return구문은 생량해도 컴파일러가 자동으로 추가해주지만,
        * 반환값이 있는 경우는 return구문을 반드시 명시적으로 작성해야한다.
        * 또한 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치하여야한다
        * */
        System.out.println("main 메소드 시작함");
        Application6 app6 = new Application6();
        app6.testMethod();

        String returnText = app6.testMethod();
        System.out.println(returnText);  //hello world 출력됨
        System.out.println(app6.testMethod());

        /*개인 복습 - */

        System.out.println("main 메소드 종료함");
    }

    public String testMethod(){

        System.out.println("new");

        return"hello world";

    }

}
/*자체 해석
* 21번째줄 main메소드 시작함을 출력한다
* 22번째 줄 Application6이라는 클래스에 app6이라는 변수를 선언하고 app6이라는 변수는 Application의 인스턴스를 포함한다
* */ //인스턴스란 해당 클래스 자체를 의미
/*23번째줄 app6의 testMethod란 메소드를 실행한다. 따라서 출력시 new가 한번 출력된다.
* 25번째 줄 returnNext라는 String형(문자열)형식의 변수를 선언하고 그 returnNext라는 변수는 app6의 testMethod라는 메소드를 포함한다.
* 26번째 returnNext 변수 값을 출력한다. 이때 위에서 이미 23번째 줄에서 returnNext 변수에 포함된 app6의 testMethod 메소드를 실행하였기 때문에 app6의 testMethod라는 메소드는 리턴값 hello world만 남아있다
* 따라서 26번째줄 출력문에는 new가 출력된 후 hello world 가 출력된다.
* 변수값에는 hello world값만 남아있지만 app6의 testMethod는 아직 리턴을 받은 상태가 아니므로 new가 출력된 후 hello world가 출력된다.*/
