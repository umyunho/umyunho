package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /*컬렉션 프레임워크에 대해 이해할 수 있다.*/
        /*
        * 컬렉션 프레임워크
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래싀 집합을 의미한다
        * */
        /*
        * 컬렉션 프레임워크는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해놓았다
        * 1.List 인터페이스
        * 2.Set 인터페이스
        * 3.Map 인터페이스
        * */
        /*
        * List인터페이스의 특징
        * 1. 순서가 있는 데이터 집합으로 데이터 중복 저장을 허용한다.
        * 2. Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        * 3. 요소의 저장 순서가 유지된다.
        * */

        /* ArratList
        * 배열의 단점을 보완하기 위해 만들어졌다.
        * 배열은 크기를 변경할 수 없고 요소의 추가, 삭제, 정렬등이 복잡하다는 단점을 가지고 있다
        * 이러한 배열의 단점을 보완하고자
        * 크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정럴 기능들을 미리 메소드로 구현해서 제공하고 있다.
        * */

        ArrayList arrayList = new ArrayList();

        List list = new ArrayList();

        Collection collection = new ArrayList<>();

        arrayList.add("apple");
        arrayList.add(123); //값 > 객체로 오토박싱
        arrayList.add(45.67);
        arrayList.add(new Date());

        System.out.println("arrayList = " + arrayList);

        arrayList.size();
        System.out.println("arrayList = " + arrayList.size());

        /* ArrayList는 get()을 이용해서 꺼내며 size()로 요소의 갯수를 반환한다.*/
        for (int i = 0;i< arrayList.size(); i++){
            System.out.println(i +" : " + arrayList.get(i));
        }

        arrayList.add("apple");

        System.out.println("arrayList = " + arrayList);

        arrayList.add(1,"banana");

        System.out.println("arrayList = " + arrayList);

        arrayList.remove(2);

        System.out.println("arrayList = " + arrayList);

        /* 지정된 위치의 값을 수정할 때에도 인텍스를 활용할 수 있으며 set()메소드를 사용한다. */
        arrayList.set(1, Boolean.valueOf(true));

        System.out.println("arrayList = " + arrayList);
        /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있다.*/
        List<String> strings = new ArrayList<>();

        /* 제네릭 타입을 지정하면 지정된 타입 외에는 인스턴스는 저장하지 못한다.*/
        strings.add("apple");
        //strings.add(123);
        strings.add("banana");
        strings.add("orange");
        strings.add("mango");
        strings.add("grape");

        System.out.println("strings = " + strings);

        /* Collection인터페이스가 아니고 Collections클래스이고 static 메소드이다.
        * 인터페이스명에 s가 붙은 클래스는 관례상 비슷한 방식으로 작성된 클래스를 의미한다.
        *  */
        Collections.sort(strings);

        System.out.println("strings = " + strings);

        /*
        * 조금 복잡하지만 내림차순 정렬도 할 수 있다.
        * 하지만 기본적으로 ArrayList는 내림차순 기능을 제공하지 않는다.
        * 역순 정렬기능은 LinkedList에 포함되어 있는데, List로 공간을 선언했기 때문에
        * ArrayList에서 LinkedList로 변경할 수 있다.
        * */
        strings = new LinkedList<>(strings);

        /*
        * Iterator 반복자 인터페이스를 활용해서 역순으로 정렬한다
        * LinkedList 타입으로 형변ㄴ환 후 descendingIterator() 메소드를 사용하면
        * 내림차순으로 정렬된 타입의 목록으로 반환해준다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false
        * next() : 다음 요소를 반환
        *
        * Collection 인터페이스의 Iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
        * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        * 인텍스로 관리되는 컬렉션이 아닌 경우에 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이다.
        * */

        Iterator<String> dIter = ((LinkedList<String>) strings).descendingIterator();

/*        while (dIter.hasNext()){
            System.out.println(dIter.next());
        }
        System.out.println("----------------------------------------------");
        while (dIter.hasNext()){
            System.out.println(dIter.next());
        }*/

        List<String> decsList = new ArrayList<>();

        while (dIter.hasNext()){
            decsList.add(dIter.next());
        }

        System.out.println("decsList : " + decsList);
    }
}
