package com.atamertc.aksam.b_04;

/*
Para cek ve para yatir metodu yaz
para cek metodunda kontrol yapacagiz bakiyemiz sifirin altindaysa islem yapamasin ve
bakiye yetersiz uyarisi vericek degilse bakiyeden dussun
para yatirda disaridan girilem degeri bakiyeye ekleyelim
test sinifinda 2 thread 100 kere donecek
her defasinda 100 tl ceksin
 */
public class Hesap {
    private int bakiye = 1000;
    Object lock1 = new Object();
    Object lock2 = new Object();

    public boolean paraCek(int cekilecekMiktar) {
        synchronized (lock1) {
            if (bakiye >= cekilecekMiktar) {
                bakiye -= cekilecekMiktar;
                System.out.println(Thread.currentThread().getName()+" cekti, hesapta ==> "+getBakiye());
                return true;
            } else {
                System.out.println("Bakiye yetersiz");
                return false;
            }
        }
    }

    public void paraYatir(int yatirilacakMiktar) {
        synchronized (lock2) {
            bakiye += yatirilacakMiktar;
            System.out.println(Thread.currentThread().getName()+" yatirdi, hesapta ==> "+getBakiye());
        }
    }

    public int getBakiye() {
        return bakiye;
    }
}
