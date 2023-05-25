package com.atamertc.sabah.threadNeIseYarar.b_03;

public class RunnableLambda {
    public static void main(String[] args) {

        Runnable runnable = ()-> {
            int toplam = 0;
            for (int i = 0; i < 11; i++) {
                toplam += i;
            }
            System.out.println("Calisan Thread: "+Thread.currentThread().getName());
            System.out.println(toplam);
        };

        new Thread(runnable).start();

        //2. kullanim
        new Thread(()-> {
            int toplam = 0;
            for (int i = 0; i < 11; i++) {
                toplam += i;
            }
            System.out.println("Calisan Thread: "+Thread.currentThread().getName());
            System.out.println(toplam);
        }).start();
    }
}
