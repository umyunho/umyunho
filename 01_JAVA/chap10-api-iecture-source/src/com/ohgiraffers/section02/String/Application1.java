package com.ogiraffers.section02.String;

public class Application1 {
    public static void main(String[] args) {
        /*String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다.*/
        /*
         * charAt() : 해당 문자열의 인덱스에 해당하는 문자를 반환한다.
         * 인덱스는 0부터 시작하는 숫자 체계를 의미하며
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundException이 발생한다.
         * */

        String str = "apple";

        for(int i = 0; i < str.length(); i++){
            System.out.println("charAt(" + i + ") : " + str.charAt(i));
        }

        

    }


}
