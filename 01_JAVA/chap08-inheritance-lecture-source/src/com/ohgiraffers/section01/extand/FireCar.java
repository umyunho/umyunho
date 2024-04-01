package com.ohgiraffers.section01.extand;

public class FireCar extends Car{
//난 Car을 상속받을거야라는 의미

    public FireCar(){

        super();
        //super 부모의 기본 생성자를 호출하는 기능 , 명시적으로 작성을 해줘야하는 규칙이있음
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }
    //private의 경우 상속 불가능


    @Override
    public void soundHorn() {
       if(isRunning()){

           System.out.println("빠아아아아아아아앙!!!!!! 빠아아아아아아아아아아아앙!!!!!!!!!");

       }else {
           System.out.println("소방차가앞으로 갈 수 없습니다. 비키세요 비켜 ~~!!!");
       }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견 했습니다. 물을 뿌립니다.==============");
    }

}
