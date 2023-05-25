package com.atamertc.sabah.threadMultilock;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;

public class ThreadliListeYazici {
    Vector<Integer> list1 = new Vector<>();
    Vector<Integer> list2 = new Vector<>();
    Random random = new Random();

    public void list1DegerEkle() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    public void list2DegerEkle() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    public void listelereDegerEkle() {
        for (int i = 0; i < 500; i++) {
            list1DegerEkle();
            list2DegerEkle();
        }
    }

    public void threadOlusturCalistir() {
        Thread t1 = new Thread(this::listelereDegerEkle);
        Thread t2 = new Thread(()->{
            listelereDegerEkle();
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("List 1 boyutu: " + list1.size() +
                "\nList 2 boyutu: " + list2.size());
    }


}
