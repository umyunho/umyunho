package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    /*1. 필드로 몬스터 이름과 체력을 저장할 공간을 선언*/
    //String name;
    //int hp;

    /*------------------------------------------------*/
    /*2. setHp를 이용해서 필드에 간접 접근하기*/
    /*
     * hp에 음수가 저장되는 것을 방지하고자 hp가 양수인 경우에만 입력한 hp로 변경하고
     * 0보다 작은 경우에 0으로 변경할 수 있도록 작성해보자
     * 메소드를 이용
     * */

    String name;
    int hp;
    //위는 필드 변수, 전역변수
    //밑은 지역변수
    public void setHp(int hp){
        if(hp > 0){
            System.out.println("양수값이 입력되어 몬스터 체력을 입력한 값으로 변경합니다.");

            /*this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수다.
             * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선으로 접근하기 때문에
             * 전역변수에 접근하기 위해서는 this.을 명시해야한다.
             * */
            this.hp = hp;

        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터 체력을 0으로 변경합니다.");
            this.hp = 0;
        }

    }
}
//자체 이해도 16,17번 줄에 name 과 hp라는 변수를 선언을 한 상태
//20번째 setHp는 정수형 변수 hp를 가진다.
//21번 20번째에 말한 정수형 변수 hp가 0보다 클때 28번째 줄 17번째 hp에 20번줄 hp의 값을 대입 this지정자