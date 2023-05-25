package com.atamertc.sabah.threadSorunlari;

public class ThreadSorun1 {

    private int count = 0;

    public static void main(String[] args) {
        ThreadSorun1 ts1 = new ThreadSorun1();
        ts1.threadleriBaslat();


    }

    public synchronized void threadSenkronErisim() {
        count++;
    }

    public void threadleriBaslat() {
        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 5000; i++) {
                threadSenkronErisim();
            }
            System.out.println("Thread 1- " + count);
        });
        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 5000; i++) {
                threadSenkronErisim();
            }
            System.err.println("Thread 2- " + count);
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();// join metodu thread bitene kadar icinde oldugu metodu bekletir
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Join Sonrasi Count: "+count);
    }

}
