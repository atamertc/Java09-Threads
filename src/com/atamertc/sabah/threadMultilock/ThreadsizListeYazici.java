package com.atamertc.sabah.threadMultilock;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListeYazici {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
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
        for (int i = 0; i < 1000; i++) {
            list1DegerEkle();
            list2DegerEkle();
        }
        System.out.println("List 1 boyutu: " + list1.size() +
                "\nList 2 boyutu: " + list2.size());
    }
}
