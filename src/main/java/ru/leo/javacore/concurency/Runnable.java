package ru.leo.javacore.concurency;

public class Runnable {
    public static class ReadData implements java.lang.Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Read data");
        }
    }

    public static class ReadDataThread implements java.lang.Runnable {

        private Thread thread;

        public ReadDataThread() {
            thread = new Thread(this);
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Read data");
        }

        public void interrupt() {
            thread.interrupt();
        }

        public void start() {
            thread.start();
        }

    }

    public static void main(String[] args) {

        Thread thread = new Thread(new ReadData());
        thread.start();
        thread.interrupt();

        ReadDataThread readDataThread = new ReadDataThread();
        readDataThread.start();
    }
}
