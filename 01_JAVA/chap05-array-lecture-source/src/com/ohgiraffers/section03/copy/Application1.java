package com.ohgiraffers.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /*수업 목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.*/
        /*
        * 배열의 복사에는 두 종류가 있다.
        * 1.얕은 복사 : stack의 주소값만 복사
        * 2.깊은 복사 : heap의 배열에 저장한 값을 복사
        * */
        //얕은 복사의 경우 stack에 주소가 있고 힙에 메모리가 할당 되어있을떄 stack값 자체를 복사함. 주소는 동일
        //깊은 복사의 경우 heap메모리가 할당되있는 값을 복사 주소는 달라짐 /클론으로 보면될듯? 이미 클론을 한것이니 복사 해온 것의 값이 달라져도 클로해온 값은 달라지지 않음
        //맥스로 쳤을때 얕은 복사는 인스턴스 복사 깊은 복사는 클론복사로 보면된다.
        /*얓은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다.
        * 따라서 두개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고있다.
        * 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게되면
        * 다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을 가르키고 있기 때문에 변경된 값이 반영된다.
        * */

        int[] originArr = {1,2,3,4,5};

        int[] copy = originArr;         //얕은 복사

        System.out.println("originArr = " + originArr.hashCode() );      //284720968
        System.out.println("copy = " + copy.hashCode());        //284720968

        for(int i = 0; i < originArr.length; i++){
            System.out.print( originArr[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < copy.length; i++){
            System.out.print( copy[i] + " ");
        }

        System.out.println();

        copy[0] = 99;

        for(int i = 0; i < originArr.length; i++){
            System.out.print( originArr[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < copy.length; i++){
            System.out.print( copy[i] + " ");
        }
        //개인 해석 heap의 0번쨰를 99로 바꾼것이기 때문에 99이후 뒤 값은 동일

    }
}
