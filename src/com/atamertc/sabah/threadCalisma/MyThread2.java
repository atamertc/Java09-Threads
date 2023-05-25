package com.atamertc.sabah.threadCalisma;

public class MyThread2 extends Thread {
    private String isim;
    //Threadin çalıştırmasını istediğimiz kodları run metodu içine yazmalıyız.
    @Override
    public void run() {
        super.run();
        System.err.println(isim + " isimli thread çalışıyor...");
        for (int i = 0; i < 5; i++) {
            System.err.println(isim + " yazdi: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println(isim+" isimli thread calismayi bitirdi");
    }
    public MyThread2(String isim) {
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
