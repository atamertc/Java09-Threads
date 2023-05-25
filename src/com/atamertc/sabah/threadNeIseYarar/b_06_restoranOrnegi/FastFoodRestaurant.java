package com.atamertc.sabah.threadNeIseYarar.b_06_restoranOrnegi;

public class FastFoodRestaurant {
    private String musteriAd;
    public int satilanBurgerAdet;

    public void burgerAl(String musteriAd) {
        beklemeSuresi();
        synchronized (this) {
            this.musteriAd = musteriAd;
            satilanBurgerAdet++;
            System.out.println(musteriAd + " burger aldi");
        }
    }

    private static void beklemeSuresi() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public int getSatilanBurgerAdet() {
        return satilanBurgerAdet;
    }

    public static void main(String[] args) throws InterruptedException {
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant();
        FastFoodRestaurant fastFoodRestaurant2 = new FastFoodRestaurant();

        Thread t1 = new Thread(() -> {
            fastFoodRestaurant.burgerAl("Can");
        });
        Thread t2 = new Thread(() -> {
            fastFoodRestaurant.burgerAl("Ece");
        });
        Thread t3 = new Thread(() -> {
            fastFoodRestaurant.burgerAl("Kemal");
        });
        Thread t4 = new Thread(() -> {
            fastFoodRestaurant.burgerAl("Su");
        });

        Thread t5 = new Thread(() -> {
            fastFoodRestaurant2.burgerAl("Can 2");
        });
        Thread t6 = new Thread(() -> {
            fastFoodRestaurant2.burgerAl("Ece 2");
        });
        Thread t7 = new Thread(() -> {
            fastFoodRestaurant2.burgerAl("Kemal 2");
        });
        Thread t8 = new Thread(() -> {
            fastFoodRestaurant2.burgerAl("Su 2");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();

        System.out.println("Toplam satilan burger: " + fastFoodRestaurant.satilanBurgerAdet);
        System.out.println("Son musteri: " + fastFoodRestaurant.getMusteriAd());
        System.out.println("Toplam satilan burger2: " + fastFoodRestaurant2.satilanBurgerAdet);
        System.out.println("Son musteri2: " + fastFoodRestaurant2.getMusteriAd());
    }
}
