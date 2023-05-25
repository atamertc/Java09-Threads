package com.atamertc.sabah.threadNeIseYarar.b_05;

public class VolatileOrnek {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            Thread.sleep(1000); //main threadi uyutur
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.threadDurdur();
        System.out.println("tetiklendi");

        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sayacim: " + myThread.getSayac());
    }
}

class MyThread extends Thread {
    volatile boolean calis = true;
    private int sayac = 0;
    @Override
    public void run() {
        while (calis) {
            sayac++;
        }
    }

    public void threadDurdur() {
        calis = false;
    }

    public int getSayac() {
        return sayac;
    }
}