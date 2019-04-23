package ru.leo.javacore.concurency.common;

public class ThreadUtils {
    private ThreadUtils(){}

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

