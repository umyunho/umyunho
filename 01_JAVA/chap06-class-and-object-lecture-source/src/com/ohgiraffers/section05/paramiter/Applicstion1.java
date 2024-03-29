package com.ohgiraffers.section05.paramiter;

public class Applicstion1 {
    public static void main(String[] args) {
        /*메소드의 파라미터에 대해 이해하고 활용할 수 있다.*/

        /*
        * 매개변수(paramiter)로 사용 가능한 자료형
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스자료형 배열
        * 5. 가변인자
        * */

        /* 인스턴스 생성 */
        ParameterTest pt = new ParameterTest();

        /*1,기본 자료형을 매개변수로 전달 받는 메소드 호출 확인*/
        int num = 10;
        pt.testPrimaryType(num);

        /*2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인*/

        int[] iarr = new int[] {1, 2, 3, 3, 5};
        System.out.println("전달 인자로 전달 하는 값 + " + iarr);
        pt.testPrimaryTypeArray(iarr);

        System.out.println("변경된 원본 배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 3.클래스 자료형 */
        RectAngle rectAngle = new RectAngle(12.5,22.5);
        System.out.println("인자로 전달 받은 값 : " + rectAngle);
        pt.testClassType(rectAngle);

        System.out.println("변경 후 사각형의 넓이와 둘레");
        rectAngle.calcRound();
        rectAngle.calcArea();

        /*4. 클래스 자료형 배열은 뒤에서 배운다.*/

        /*5. 가변인자 */
        //pt.testPrimaryTypeArray(); //인자가 없어서 오류
        pt.testVariableLengthArray("홍길동");
        pt.testVariableLengthArray("유관순","볼링");
        pt.testVariableLengthArray("이순신", "볼링", "농구","축구");
        pt.testVariableLengthArray("신사임당", new String[]{"테니스","서예"});
    }



}
