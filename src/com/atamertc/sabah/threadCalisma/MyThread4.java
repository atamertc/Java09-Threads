package com.atamertc.sabah.threadCalisma;

public class MyThread4 implements Runnable {

    private String isim;
    //Threadin çalıştırmasını istediğimiz kodları run metodu içine yazmalıyız.
    @Override
    public void run() {
        System.err.println(isim + " isimli thread çalışıyor...");
        for (int i = 0; i < 50; i++) {
            System.err.println(isim + " yazdi: " + i);
            i += 4;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println(isim+" isimli thread calismayi bitirdi");
    }
    public MyThread4(String isim) {
        super();
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
}
