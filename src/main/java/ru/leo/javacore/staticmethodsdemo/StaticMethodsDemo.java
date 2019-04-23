package ru.leo.javacore.staticmethodsdemo;

import java.io.Serializable;

public class StaticMethodsDemo implements Serializable {

    void getPush(){
        System.out.println("I'm not a static method!");
    }

    static void tryToUseNotStaticInnerMethod(){
        new StaticMethodsDemo().getPush();
        System.out.println("I'm static method!");
    }

    public static void main(String[] args) {
        StaticMethodsDemo.tryToUseNotStaticInnerMethod();
    }
}


