package com.atamertc.sabah.threadNeIseYarar.b_04;

import java.util.stream.IntStream;

public class RunnableSayiToplamaLambda {
    //metodu senkronize etmek yerine buda olurdu
    //public volatile static int sonuc;
    public static int sonuc;

    public static void main(String[] args) {
        int toplam = IntStream.rangeClosed(0, 5000).sum();
        System.out.println("IntStream Sonuc: " + toplam);
        int[] dizi = IntStream.rangeClosed(0, 5000).toArray();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < dizi.length / 2; i++) {
                topla(dizi[i]);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = dizi.length / 2; i < dizi.length; i++) {
                topla(dizi[i]);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threadler Sonuc: " + sonuc);
    }

    //asagidaki metodu senkronize ettik yoksa sonuc yanlis geliyodu!!
    public synchronized static void topla(int a) {
        sonuc += a;
    }

}
