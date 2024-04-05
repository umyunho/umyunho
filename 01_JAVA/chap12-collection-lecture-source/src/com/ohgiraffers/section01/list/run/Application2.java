package com.ohgriffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgriffers.section01.list.comparator.AscendingPrice;
import com.ohgriffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayList 정렬 기능을 이해할 수 있다.*/

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부식",46000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));

        /* 제네릭 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort가능 */
        //Collections.sort(bookList);

        for (BookDTO book : bookList){
            System.out.println(book);
        }

        /*
        * 익명클래스는 뒤에()를 만들어서 인터페이스를 상속받는 클래스인데
        *
        * */

        bookList.sort(new AscendingPrice());

        System.out.println("=====가격 오름차순 정렬=============");

        for (BookDTO book : bookList){
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() { // 익명클래스
            @Override
            public int compare(BookDTO o1, BookDTO o2) {


                return o1.getPrice() >= o2.getPrice()? -1 :1;
            }
        });

        System.out.println("가격 내림차순 정렬==========================");
        for (BookDTO book : bookList){
            System.out.println(book);
        }

        /*
        * Comparator 인터페이스 : List에  default 메소드인 sort()메소드 인자로
        * 정렬의 기준이 되는 인스턴스를 넣어주게 되면 우리가 오버라이딩한 메소드가 동작하게 되며
        * 그걸 기준으로 삼는다.
        * */
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return 0;
            }
        });


    }
}
