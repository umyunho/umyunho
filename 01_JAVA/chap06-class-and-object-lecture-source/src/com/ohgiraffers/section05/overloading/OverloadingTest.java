package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /*수업 목표. 오버로딩(OVERLOADING)에 대해 이해할 수 있다.*/

    /*
    * Overloading을 사용하는 이유
    * 매개변수 종류 별로 메소드 내용을 다르게 작성해야하는 경우들이 있다.
    * 이때 동일한 기승의 메소드를 매개변수에 따라 이름을 정의하면 복잡하고 관리가 어렵다.
    * 규모가 작은 프로그램의 경우는 정도가 덜하지만, 규모가 거대한 경우 메소드 또한 관리가 어려워진다.
    * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야하는 여러 메소드를
    * 동일한 이름으로 관리하기 위해 사용한는 기술을 오버로딩이라고 한다.
    * */

    /*
    * 오버로딩의 조건
    * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수 타입, 갯수, 순서를 다르게 작성하여
    * 한 클래스 내에서 동일한 이름의 메소드를 여러개 작성할 수 있다.
    * 메소드의 시그니처가 다르면 다른 메소드로 인식하기 때문이다.
    * 즉 시그니처 중 메소드의 이름은 동일해야하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.
    * */

    /* 메소드 시그니처란?
    * Publics void method(int num){}이라는 메소드의 메소드명과 파라미터 선언부 부분을 시그니처라고 부른다.
    * method(int num) 이 부분이 시그니처다.
    * 메소드 시그니처가 달라야 하기때문에 접근제한자나 변환형은 오버로딩 성립 요건에 해당하지 않는다
    * */

    public void test(){}
    //public void test(){} //같으면 에러
    //private void test(){} //에러남 접근제한자는 메소드 시그니처에 해당하지 않음.
/*    public int test(){  //에러 - 반환형도 메소드 시그니처에 해당하지 않는다.
       return 0;
    }*/

    public void test(int num){}   //파라미터 선언부는 메소드 시그니처에 해당함.
    //public void test(int nem2){}  //매개변수의 이름은 메소드 시그니처에 영향을 주지않는다.
    public void test(int num, int num2){}   //매개변수 갯수에 따른 오버로딩 확인.
    public void test(int num, String name){} //매개변수 타입에 따른 오버로딩 확인.
    public void test(String name, int num){} //배개변수 순서에 따른 오버로딩 확인.


}
