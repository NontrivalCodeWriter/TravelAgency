package ru.leo.javacore.testnewfeature;

import java.util.ArrayList;

public class TestNewFeature {


    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Dog dog=new Dog("Krosha",1);
        arrayList.add("Aaa");
        arrayList.add(dog);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(0));
        Dog dog2=(Dog) arrayList.get(1);
        dog2.sit();

    }

}
