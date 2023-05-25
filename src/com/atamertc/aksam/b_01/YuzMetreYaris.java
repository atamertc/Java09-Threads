package com.atamertc.aksam.b_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class YuzMetreYaris {
    public static void main(String[] args) {

        Kosucu kosucu1 = new Kosucu("Ata");
        Kosucu kosucu2 = new Kosucu("Mustafa");
        Kosucu kosucu3 = new Kosucu("Mert");
        Kosucu kosucu4 = new Kosucu("Berkin");
        Kosucu kosucu5 = new Kosucu("Arda");

        Thread t1 = new Thread(kosucu1);
        Thread t2 = new Thread(kosucu2);
        Thread t3 = new Thread(kosucu3);
        Thread t4 = new Thread(kosucu4);
        Thread t5 = new Thread(kosucu5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Kosucu> kosucular = new ArrayList<>(List.of(kosucu1, kosucu2, kosucu3, kosucu4, kosucu5));

        kosucular.stream()
                .sorted(Comparator.comparing(Kosucu::getSure))
                .forEach(System.out::println);
    }
}
