package com.atamertc.sabah.threadSorunlari;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSorun2 {

    public static void main(String[] args) {
        //Atomic veri turleri
        AtomicInteger sayac = new AtomicInteger(1);
        List<String> isimList = List.of("Recep", "Efe", "Levent", "Tarik", "Ali", "Cemal");
        isimList.forEach(x->{
            System.out.println(sayac + ".kisi " + x);
            sayac.getAndIncrement();
        });

    }
}
