package com.atamertc.aksam.b_02;
/*
 * kuyrugumuz bosalana kadar taksilerimiz sıra ile kuyrgumuzdan musterileri alsın
 * kuyrukdan aldıgı musteri nosunu kendi içinde tuttgu musterinoları
 * listesine eklesin
 * 1. nolu taksi--->5.müsterisini aldı --> musteri idsi 8;
 * dongumuz sona erdiğinde
 * 1 nolu taksı toplamda 20 musteri aldı ve mesaisi sona erdi
 * 2 nolu taksı toplamda 20 musteri aldı ve mesaisi sona erdi
 *
 */
public class Test {
    public static void main(String[] args) {

        Durak durak = new Durak();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(durak.getTaksiler().get(i));
            thread.start();
        }
    }
}
