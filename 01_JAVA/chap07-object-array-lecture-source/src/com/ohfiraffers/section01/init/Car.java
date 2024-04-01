package com.ohfiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String model1Name, int maxSpeed) {
        this.modelName = model1Name;
        this.maxSpeed = maxSpeed;
    }

    public void deiverMaxSpeed(){
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed+ "km/h로 달려갑니다.");
    }

}
