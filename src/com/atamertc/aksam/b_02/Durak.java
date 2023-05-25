package com.atamertc.aksam.b_02;

import java.util.*;

public class Durak {
    private List<Taksi> taksiler;
    public static Queue<Integer> musteriKuyrugu;

    public Durak() {
        this.taksiler = new ArrayList<>();
        musteriKuyrugu = new PriorityQueue<>();
        musteriOlustur();
        taksiOlustur();
    }

    public void musteriOlustur() {
        for (int i = 1; i <= 100; i++) {
            musteriKuyrugu.add(i);
        }
    }

    public void taksiOlustur() {
        for (int i = 1; i <= 10; i++) {
            Taksi taksi = new Taksi(i);
            taksiler.add(taksi);
        }
    }

    public List<Taksi> getTaksiler() {
        return taksiler;
    }

    public void setTaksiler(List<Taksi> taksiler) {
        this.taksiler = taksiler;
    }

    public Queue<Integer> getMusteriKuyrugu() {
        return musteriKuyrugu;
    }

    public void setMusteriKuyrugu(Queue<Integer> musteriKuyrugu) {
        this.musteriKuyrugu = musteriKuyrugu;
    }

    public static synchronized int musteriAl() {
        return musteriKuyrugu.poll();
    }

    public static synchronized boolean durakIsEmpty() {
        return musteriKuyrugu.isEmpty();
    }
}
