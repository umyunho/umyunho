package com.ohgiaraffers.section04.uses2;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomthing(){
        String data = "String data";
        saveProvider.save(data);
    }

}
