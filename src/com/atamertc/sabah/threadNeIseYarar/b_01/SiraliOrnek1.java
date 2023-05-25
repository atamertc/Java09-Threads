package com.atamertc.sabah.threadNeIseYarar.b_01;
/*
Butun kodlar sirali sekilde calisir
Thread hangi pakette? -> java.lang paketi icindedir
Multithread: Bir process icinde birden fazla Threadin calistigi yapi
Thread neden kullanilir? ->
1- Eszamanlilik: Ayni anda birden fazla gorevin paralel olarak yurutulmesini saglamak
2- Arka planda islemlerin devam etmesi: Veritabani sorgulari, ag istekleri, dosya islemleri
3- Islemci kaynaklarini verimli kullanmayi saglar

Singlethread: Normalde bizim kullandigimiz yapi. Tek bir thread var, main thread

Thread stateleri:
New: Threadin yeni yaratildigi andaki durumu
Runnable: start() metodu ile tetiklenince gecilen durum
Running: Thread calismaya basladiginda gecitigi durum
Blocked: Lock yuzunden gecici olarak pasif duruma gecmesi
Waiting: notify gelene kadar bekleme durumu
Dead: Icindeki islemleri bitirdikten sonra gectigi durum
 */
public class SiraliOrnek1 {

    public static void main(String[] args) {
        System.out.println("Calisan Thread: "+Thread.currentThread().getName());
        Isci1 isci1 = new Isci1();
        Isci2 isci2 = new Isci2();

        long baslangic = System.currentTimeMillis();
        isci1.calis();
        isci2.calis();
        long bitis = System.currentTimeMillis();
        System.out.println("Programin aldigi vakit: "+(bitis - baslangic));

    }
}

class Isci1{
    public void calis() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Isci 1 calisiyor -> " + i + ". isi bitirdi.");
        }
    }


}

class Isci2{
    public void calis() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Isci 2 calisiyor -> " + i + ". isi bitirdi.");
        }
    }
}