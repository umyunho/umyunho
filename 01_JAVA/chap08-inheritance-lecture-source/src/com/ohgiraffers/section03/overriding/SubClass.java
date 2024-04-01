package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    /*1. 메소드 이름을 변경하면 에러 발생*/

   /* @Override
    public void method2(int num) {
    }
*/ //이름 변경해서 에러발생

    //2.매개변수 객수와 타입이 변경되면 에러발생
    /*@Override
    public void method(String num) {
        super.method(num);
    }*/

    //3.메소드 리턴 타입을 변경하면 에러발생
    /*@Override
    public void method(int num) {
        return 0;
    }*/

    /*4. 메소드 이름, 리턴타입, 매개변수의 갯수, 타입, 순서가 일치할 경우 오버라이딩 성립.*/
    @Override
    public void method(int num) {
    }

    /*5.private 메소드는 오버라이딩 불가능*/
    /*@Override
    private void privateMethod(){}*/

    /*6. 접근제한자가 public여도 final키워드는 오보라이딩 불가능*/
    /*@Override
    public final void finalMethod(){}*/

    // 부모보다 좁은 범위라 불가능
    /*@Override
    void protectMethod(){}*/

    //동일한 범위라 가능
    @Override
    public void protectedMethod() {
    }

    //부모 범위보다 넓은 범위라 가능
    @Override
    public void protectedMethod() {
    }

    /*참고로 클래스에도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드이다,(클래스 확장 불가)*/
}
