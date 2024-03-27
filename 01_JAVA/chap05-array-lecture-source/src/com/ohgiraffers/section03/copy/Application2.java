package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        /*얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.*/

        /*
        * 얕은 복사의 활용
        * 얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */

        String[] name = {"홍길동", "유관순", "이순신"};

        System.out.println("name.hashcode() = " + name.hashCode()); //284720968

        /* 1. 인자와 매개변수로 활용*/
        print(name);

        /* 2. 리턴값으로 활용*/
        String[] animals = getAnimals();
        //리턴 받은 주소값도 같은지 확인

        System.out.println("리턴 받은 animals.hashcode() = " + animals.hashCode());

        print(animals);


    }

    //다른 메소드에서 동일한 배열의 값을 활용하고 싶을때 얕은 복사를 사용한다.
    public static void print(String[] sarr){

        System.out.println("sarr.hashcode() = " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++ ){
            System.out.print(sarr[i] + " ");

            System.out.println();
        }


    }

    public static String[] getAnimals(){

        //new를 붙이면 heap영역에 새로해주겠다.

        String[] animals = new String[] {"뱀", "판다", "다람쥐"};

        System.out.println("새로만든 animals의 hashcode 값은 : " + animals.hashCode());

        return animals;
        //매개변수가 없다? 리턴값이 있다고 매개변수가 있는게 아니다?
        //getAnimals의 값은 return값인 animals가 아닌가?
    }




}

/*자체 해석:
* 21번째 줄에서 문자열 animals 변수는 getAnimals의 인스턴스를 받는다.

24번째 줄은 animals의 해시코드 값을 호출한다.

26번째 줄은 animals값을 프린트한다.

45번째 줄에서 getAnimals라는 메소드를 만든다.

49번째 줄에서 animals라는 변수를 선언하고 그 값은 뱀 판다 다람쥐

51번째 줄에서 animals의 해쉬코드 값으 호출한다.

53번째ㅔ 줄에서 변수 animals를 리턴 값으로 받는다

다시 올라가서

21번째 줄에서 getanimals 메소드를 실행한다.

24번째 줄에서 animals의 해쉬코드 값을 출력하고

여기까진ㄴ 이해완료 근데 어째서 리턴받은---이후에 sarr의 해쉬코드가 나오는지

26번째 프린트에서는 animals의 리턴 값을 프린트 하는 것이고 animals변수의 리턴값은 animals변수의 값을 리턴 받는것이기에 animals의 저장된 값인 뱀 판다 다람쥐가 나오는것

이전과는 다르게 print가 함수가 아닌 32번째 줄에서 선언한 변수로 나오는 것이라서 출력이 되는 것인가?

* */

/*15번째 줄에서 name의 해시코드 출력
18번째 줄에서 print 메소드를 호출 / print메소드는 32번째 줄에 작성했듯이 sarr이며 sarr의 해시코드를 출력하는 구문을 포함하고 있어서 sarr의 해시코드가 출력되고
여기서 name의 값이 들어가기에 name변수의 값이 출력됨
21번째 줄에서 animals라는 변수에 getAnimals라는 메소드를 포함함
24번째 줄에서 animals라는변수의 해시코드를 출력 / animals는 21번쨰 줄에서 getAnimals라는 메소드를 포함 시켰고 51번 줄에있는 getAnimals 메소드의 출력구문이 먼저 실행되고  24번째 줄의 출력구문이 출력됨
26번째 줄에서 print(animals)를 호출했기에 32번쨰 줄에서 생성한 print메소드가 출력되고 그 메소드에 sarr.hashcode 출력코드가 있어서 sarr.hashcode가 출력됨
그리고 print메소드 안에 animals를 넣었기에 45번째 줄에 생성한 getAnimals 메소드의 변수값인 뱀 판다 다람쥐가 호출됨*/

//물어봐야할거 = 출력문구를 작성 안했는데 어떻게 출력이 되었는가
