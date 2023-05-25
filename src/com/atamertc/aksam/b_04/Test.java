package com.atamertc.aksam.b_04;

import com.atamertc.aksam.b_03.Product;

public class Test {
    public static void main(String[] args) {
        Hesap hesap = new Hesap();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                if (!hesap.paraCek(5000)) {
                    i--;
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                hesap.paraYatir(5000);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(hesap.getBakiye());
    }
}
