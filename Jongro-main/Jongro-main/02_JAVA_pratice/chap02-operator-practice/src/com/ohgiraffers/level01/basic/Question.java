package com.ohgiraffers.level01.basic;

public class Question {

    public static void main(String[] args) {

        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); // 우선 순위에 의해서 뒤의 x < 0 && x > 2를 먼저 계산하여 false가 나오고 그것을 토대로 y >= 5 와 ||(or)8oiiiii88o 연산을하면  y >=는 참이므로 true가 반환된다.
        System.out.println(y += 10 - x++); // y = 15라는 계산결과가 나오고 x++는 연산을 진행한 뒤 x의 값을 증가시키는 연산식이므로 15 -2 해서 3이라는 결과가 나옴
        System.out.println(x+=2); //위에서 x++ 로 인해 x는 3이 되어있는 상태이다. 그 상태에서 추가로 2라는 값을 더하는 것이므로 5라는 답이 나온다.
        System.out.println( !('A' <= c && c <='Z') ); // A는 65라는 것이 명시되어있는 상태, c = A이므로 &&연산 앞의 결과는 true가 나오며 뒤의 결과 또한 아스키코드상 Z의 숫자가 A보다 크므로 참이 나오게된다. 그러나 ! 연산에 의거 거짓이 반환된다.
        System.out.println('C'-c); //A의 문자코드는 65 C의 문자코드는 67 따라서 2라는 결과값이 도출된다.
        System.out.println('5'-'0'); //char은 문자를 받는 자료형이나 문자는 아스키코드로 대입이 가능하므로 숫자 또한 대입이 가능하다. 따라서 값은 5 (5를 문자로보고 5에 해당하는 아스키코드가 존재
        System.out.println(c+1); // c의 값이 A이며 A의 아스키값은 65이므로 66이 나오게된다.
        System.out.println(++c); //c를 먼저 1 증가시키는 것이므로 B가 반환된다.
        System.out.println(c++); // 증가를 나중에 시키는 것이므로 B가 반환된다.
        System.out.println(c); // 위에서 반환한후 +1을 해주므로 C가 반환된다.

        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 :0);
        System.out.println( "필요한 바구니의 수 : " + 10);
    }

}