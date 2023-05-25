package com.atamertc.aksam.b_03;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();

        Thread t1 = new Thread(()->{
            while (product.getStok() != 0) {
                product.urunSat();
                System.out.println("Thread BIR-1 kalan urun miktari ==> "+product.getStok());
            }
        });
        Thread t2 = new Thread(()->{
            while (product.getStok() != 0) {
                product.urunSat();
                System.out.println("Thread IKI-2 kalan urun miktari ==> "+product.getStok());
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

        System.out.println(product.getStok());
    }
}
