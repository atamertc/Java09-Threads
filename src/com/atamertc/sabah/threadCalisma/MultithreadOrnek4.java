package com.atamertc.sabah.threadCalisma;

public class MultithreadOrnek4 {

    public static void main(String[] args) {
        String isim1 = "Lambda Thread 1";
        Thread thread1 = new Thread(() -> {
            System.err.println(isim1 + " isimli thread çalışıyor...");
            for (int i = 0; i < 5; i++) {
                System.err.println(isim1 + " yazdi: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.err.println(isim1 + " isimli thread calismayi bitirdi");
        });
        thread1.start();

        String isim2 = "Lambda Thread 2";
        new Thread(() -> {
            System.out.println(isim2 + " isimli thread çalışıyor...");
            for (int i = 0; i < 5; i++) {
                System.out.println(isim2 + " yazdi: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(isim2 + " isimli thread calismayi bitirdi");
        }).start();









    }
}
