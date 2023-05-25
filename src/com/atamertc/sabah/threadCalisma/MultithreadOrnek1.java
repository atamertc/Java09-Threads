package com.atamertc.sabah.threadCalisma;

public class MultithreadOrnek1 {
    /*
    Teams: Multithread bir uygulamadir.

    Thread: Is parcacigi -> Her bir process icindeki kucuk program parcaciklari
    Process: Islemler -> Teams, Word, Chrome, Oyun

    Multitasking: Bilgisayarin bir cok process'i ayni anda calistirmasi
    Multithreading: Bir process icinde birden cok thread olusturulmasi ve bir cok isi
    ayni process icinde ayni anda yapilmasi.

    Java uygulamasi calistirdiginiz anda JVM uzerinde calisan bir process olur
    Her bir uygulama kendi memory space'ine sahip olacak

     */
    public static void main(String[] args) throws InterruptedException {

        //mainThread
//        System.out.println(Thread.currentThread()); //Thread[#1,main,5,main]
//        int x = 10;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(x++);
//            Thread.sleep(1000);
//        }

        MyThread myThread1 = new MyThread("myThread1");
        MyThread2 myThread2 = new MyThread2("myThread2");

        System.out.println("Main thread calisiyor");
        //Eszamanlilik: Concurrecy
        myThread1.start(); // Thread icindeki run() metodu calisir.
        myThread2.start();
        //Main thread join edilen threadler bitene kadar calismaya devam etti
        myThread1.join();
        myThread2.join();
        System.out.println("Main thread calismayi bitirdi");





    }
}
