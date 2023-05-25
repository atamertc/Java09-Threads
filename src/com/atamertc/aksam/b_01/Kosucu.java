package com.atamertc.aksam.b_01;

public class Kosucu implements Runnable{
    private String isim;
    private int mesafe;
    private long sure;
    private long baslangicZamani;

    public Kosucu(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public long getSure() {
        return sure;
    }

    public void setSure(long sure) {
        this.sure = sure;
    }

    public long getBaslangicZamani() {
        return baslangicZamani;
    }

    public void setBaslangicZamani(long baslangicZamani) {
        this.baslangicZamani = baslangicZamani;
    }

    @Override
    public void run() {
        this.baslangicZamani = System.currentTimeMillis();
        while (mesafe < 100) {
            mesafe++;
            if (mesafe % 10 == 0) {
                System.out.println(isim + " ===> "+mesafe+". metrede");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long bitisZamani = System.currentTimeMillis();
        this.sure = bitisZamani - baslangicZamani;
        System.out.println(isim + " adli kosucu 100 metreyi " + sure + " ms de kosmustur");
    }

    @Override
    public String toString() {
        return "Kosucu{" +
                "isim='" + isim + '\'' +
                ", mesafe=" + mesafe +
                ", sure=" + sure +
                ", baslangicZamani=" + baslangicZamani +
                '}';
    }
}
