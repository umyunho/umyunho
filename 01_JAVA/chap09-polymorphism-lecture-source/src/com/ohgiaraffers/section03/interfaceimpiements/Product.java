package com.ohgiaraffers.section03.interfaceimpiements;

public class Product extends Object implements InterProduct{

    /*
    * 클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속 받을 수 있으며,
    * extends로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스 추가 상속이 가능해진다.
    * 단, extends키워드를 앞에 작성하고 implements를 뒤에 작성한다.(순서 바뀌면 에러 발생)
    * */


    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨...");
    }

    @Override
    public void absMethod() {
        System.out.println("Product의 absMethod 오버라이딩한 메소드 호출됨...");
    }


        //스태틱 메소드는 오버라이딩 불가
/*    @Override
    public static void staticMethod(){}*/
        //디폴트 메소드는 인터페이스에서만 작성 가능하다.
/*    @Override
    public default void defaultMethod(){}*/

    @Override
    public void defaultMethod() {
        System.out.println("InterProduct의 defaultMethod 호출됨...");
    }

}
