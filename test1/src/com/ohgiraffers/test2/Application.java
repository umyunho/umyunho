package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;
import static com.ohgiraffers.test1.TestMethod.TestRandom;

public class Application {
    public static void main(String[] args) {

        TestMethod tm = new TestMethod();
        tm.Calculator(2, 5);

        System.out.println("=================");

        double circle = tm.CircleArea();
        System.out.println("원의 부피는 " + circle + "입니다.");

        System.out.println("=================");

        String str = TestRandom();
        System.out.println(str);

    }
}
