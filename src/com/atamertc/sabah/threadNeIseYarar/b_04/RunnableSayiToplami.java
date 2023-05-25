package com.atamertc.sabah.threadNeIseYarar.b_04;

import java.util.stream.IntStream;

public class RunnableSayiToplami {
    public static int sonuc;

    public static void main(String[] args) {

        int toplam = IntStream.rangeClosed(0, 5000).sum();
        System.out.println("IntStream Sonuc: "+toplam);
        int[] dizi = IntStream.rangeClosed(0, 5000).toArray();

        IsciBaris isciBaris = new IsciBaris(dizi);
        IsciSavas isciSavas = new IsciSavas(dizi);

        Thread thread1 = new Thread(isciBaris);
        Thread thread2 = new Thread(isciSavas);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //1. yontem
        System.out.println("Getter Sonuc: " + (isciBaris.getToplam() + isciSavas.getToplam()));
        //2. yontem
        System.out.println("Threadler Sonuc: " + sonuc);
    }

    public static void topla(int a) {
        sonuc += a;
    }
}

class IsciBaris implements Runnable {
    private int[] arr;
    private int toplam;

    public int getToplam() {
        return toplam;
    }

    public IsciBaris(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length/2; i++) {
            toplam += arr[i];
        }
        RunnableSayiToplami.topla(toplam);
    }
}

class IsciSavas implements Runnable {
    private int[] arr;
    private int toplam;

    public int getToplam() {
        return toplam;
    }

    public IsciSavas(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = arr.length/2; i < arr.length; i++) {
            toplam += arr[i];
        }
        RunnableSayiToplami.topla(toplam);
    }
}
