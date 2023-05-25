package com.atamertc.sabah.threadCalisma;

public class MyThread extends Thread {

    private String isim;
    //Threadin çalıştırmasını istediğimiz kodları run metodu içine yazmalıyız.
    @Override
    public void run() {
        super.run();
        System.out.println(isim + " isimli thread çalışıyor...");
        for (int i = 0; i < 10; i++) {
            System.out.println(isim + " yazdi: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(isim+" isimli thread calismayi bitirdi");
    }
    public MyThread(String isim) {
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
