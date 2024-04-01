package com.ohgiraffers.section03.overriding;

public class SuperClass {
    /*수업목표. 오버라이딩(overriding)에 대해 이해할 수 있다.*/
    /*
    * 오버라이딩이란?
    * 부모클래스에서 상속받은 메소드를 자식 클래스에서 재정의하여 사용하는 것이다.
    * */
    /*
    * 오버라이딩 성립 요건
    * 1. 메소드 이름이 동일해야한다.
    * 2. 메소드의 리턴 타입이 동일해야한다.
    * 3. 매개변수 타입, 객수, 순서가 동일해야한다.
    * 4. private 메소드는 접근이 불가능하기 때문에 오버라이딩이 불가능하다.
    * 5. final키워드가 사용된 메소드는 오버라이딩이 불가능하다.
    * 6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야한다.
    * 7. 예외 처리는 같은 예외거나 더 구체적(하위)인 예외를 처리해야한다. * 예외 챕터에서 다룸
    * */

    public void method(int num){}
    private void privateMethod(){}
    public final void finalMethod(){}
    protected void protectedMethod(){}


}
