package com.atamertc.sabah.threadNeIseYarar.b_03;

public class RunnableGeleneksel {
    public static void main(String[] args) {
        //Anonymous Inner Type
        Runnable runnable = new Runnable() {
            @Override
            public void run() { //run() metodu voidtir.
                int toplam = 0;
                for (int i = 0; i < 11; i++) {
                    toplam += i;
                }
                System.out.println("Calisan Thread: "+Thread.currentThread().getName());
                System.out.println(toplam);
            }
        };

        System.out.println("Calisan Thread: "+Thread.currentThread().getName());
        new Thread(runnable,"runnableCalistiranThread").start();
    }
}
