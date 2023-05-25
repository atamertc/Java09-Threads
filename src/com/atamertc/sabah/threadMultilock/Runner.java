package com.atamertc.sabah.threadMultilock;

public class Runner {

    public static void main(String[] args) {

//        ThreadsizListeYazici threadsizListeYazici = new ThreadsizListeYazici();
//        long baslangic = System.currentTimeMillis();
//        threadsizListeYazici.listelereDegerEkle();
//        long bitis = System.currentTimeMillis();
//        System.out.println("Gecen sure: " + (bitis - baslangic));

//        ThreadliListeYazici threadliListeYazici = new ThreadliListeYazici();
//        long baslangic = System.currentTimeMillis();
//        threadliListeYazici.threadOlusturCalistir();
//        long bitis = System.currentTimeMillis();
//        System.out.println("Gecen sure: " + (bitis - baslangic));

        ThreadliMultilockluListeYazici multilocklu = new ThreadliMultilockluListeYazici();
        long baslangic = System.currentTimeMillis();
        multilocklu.threadOlusturCalistir();
        long bitis = System.currentTimeMillis();
        System.out.println("Gecen sure: " + (bitis - baslangic));
    }
}
