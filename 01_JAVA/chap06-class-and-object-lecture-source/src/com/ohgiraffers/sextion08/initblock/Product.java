package com.ohgiraffers.sextion08.initblock;

public class Product {
    /*1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다.*/

/*
    private String name;
    private int price;
    private static String brand;
*/
    /* 2. 명시적 초기화*/
    private  String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    /* 3. 인스턴스 블럭 초기화. */
    {
        name = "사이언";
        price = 900000;

        /*주의 사항
        * 인스턴스 초기화 블럭에서는 static필드를 초기화 할 수 있는것처럼 보인다.
        * 하지만 static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화를 진행했다.
        * 따라서 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에 인스턴스 초기화 블럭에서 대입한 값으로
        * 덮어쓰기 되는것이다.
        * */

        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함...");

    }

    public String getInformation(){
        return "Product [name=" + this.name + ", price"+this.price + ",brand = "
                +Product.brand+"]";
    }

    static {
        /* 주의 사항
        * static 초기화 블럭에서는 non-static필드를 초기화 하지 못한다.
        * 정적 초기화블럭은 클래스 로드시에 동작한다.
        * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에
        * 존재하지 않은 인스턴스 변수를 초기화 하는 것은
        * 시기상으로 불가능하다.
        * */

        //name = "아이묭";
        //price = 5000000;

        brand = "LG";
        System.out.println("정적 초기화 블럭 동작함...");

    }

    public Product(){
        System.out.println("기본 생성자 호출함...");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");
    }
}
