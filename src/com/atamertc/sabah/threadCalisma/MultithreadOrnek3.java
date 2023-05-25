package com.atamertc.sabah.threadCalisma;

public class MultithreadOrnek3 {
    //interfaceler newlenemez
    //Anonymous Inner Tipe: her ne kadar yeni bir interface tanimlaniyor gibi gorunsede,
    // yeni bir class olusturur. Ama bu class Runnable'i implement eder
    public static void main(String[] args) {

        String isim = "Anonymous Thread";
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println(isim + " isimli thread çalışıyor...");
                for (int i = 0; i < 5; i++) {
                    System.err.println(isim + " yazdi: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.err.println(isim+" isimli thread calismayi bitirdi");
            }
        }).start();





    }
}
