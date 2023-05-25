package com.atamertc.sabah.threadCalisma;

public class MultithreadOrnek2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread3("myThread3"));
        Thread thread2 = new Thread(new MyThread4("myThread4"));
        Thread thread3 = new Thread(new MyThread5("myThread5"));
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
