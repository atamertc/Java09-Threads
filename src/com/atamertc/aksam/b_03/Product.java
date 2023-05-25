package com.atamertc.aksam.b_03;

/*
bir tane stock degeri tanimlayacagiz ve baslangic degeri 1000
Urun sat diye bir metot olacak ve calistiginda stoktaki urunler 1 er azalicak
Test sinifinda iki tane lambda thread tanimlayip urun sat metodunu 500 defa calistir
En son mainde count degerini yazdir
 */
public class Product {
    private int stok = 1000;

    public synchronized void urunSat() {
        stok--;
    }

    public int getStok() {
        return stok;
    }
}
