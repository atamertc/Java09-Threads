package com.atamertc.sabah.threadNeIseYarar.b_01;

public class ParalelOrnek1 {
    public static void main(String[] args) {
        System.out.println("Calisan Thread: "+Thread.currentThread().getName());
        ParalelIsci1 paralelIsci1 = new ParalelIsci1();
        ParalelIsci2 paralelIsci2 = new ParalelIsci2();

        long baslangic = System.currentTimeMillis();
        paralelIsci1.start();
        paralelIsci2.start();
        try {
            paralelIsci1.join();
            paralelIsci2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long bitis = System.currentTimeMillis();
        System.out.println("Programin aldigi vakit: "+(bitis - baslangic));
    }
}
class ParalelIsci1 extends Thread{
    @Override
    public void run() {
        System.out.println("Calisan Thread: "+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Isci 1 calisiyor -> " + i + ". isi bitirdi.");
        }
    }
}

class ParalelIsci2 extends Thread{
    @Override
    public void run() {
        System.out.println("Calisan Thread: "+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Isci 2 calisiyor -> " + i + ". isi bitirdi.");
        }
    }
}