package com.atamertc.aksam.b_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Taksi implements Runnable {
    private int id;
    private int musteriSayisi;
    private List<Integer> musteriNolar;
    private long beklemeSuresi;

    public Taksi(int id) {
        this.id = id;
        this.beklemeSuresi = beklemeSuresiAta();
        this.musteriNolar = new ArrayList<>();
    }
    public long beklemeSuresiAta() {
        Random random = new Random();
        return random.nextLong(1000, 5000);
    }

    @Override
    public void run() {
        while (!Durak.musteriKuyrugu.isEmpty()) {
            int musteriId = Durak.musteriKuyrugu.poll();
            musteriNolar.add(musteriId);
            musteriSayisi++;
            try {
                Thread.sleep(beklemeSuresi);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(id + " nolu taksi ===> " + musteriNolar.size() +
                    ". musterisini aldi ===> musteri id: " + musteriId);
        }
        System.out.println(id + " nolu taksi toplamda " + musteriNolar.size() +
                " musteri aldi ve mesaisi sona erdi");
    }

    @Override
    public String toString() {
        return "Taksi{" +
                "id=" + id +
                ", musteriSayisi=" + musteriSayisi +
                ", musteriNolar=" + musteriNolar +
                ", beklemeSuresi=" + beklemeSuresi +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusteriSayisi() {
        return musteriSayisi;
    }

    public void setMusteriSayisi(int musteriSayisi) {
        this.musteriSayisi = musteriSayisi;
    }

    public List<Integer> getMusteriNolar() {
        return musteriNolar;
    }

    public void setMusteriNolar(List<Integer> musteriNolar) {
        this.musteriNolar = musteriNolar;
    }

    public long getBeklemeSuresi() {
        return beklemeSuresi;
    }

    public void setBeklemeSuresi(long beklemeSuresi) {
        this.beklemeSuresi = beklemeSuresi;
    }
}
