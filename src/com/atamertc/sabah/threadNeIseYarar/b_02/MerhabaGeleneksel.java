package com.atamertc.sabah.threadNeIseYarar.b_02;

public class MerhabaGeleneksel implements ISelamVer, IBesArtir, IBirlestir{
    public static void main(String[] args) {
        MerhabaGeleneksel merhabaGeleneksel = new MerhabaGeleneksel();
        System.out.println(merhabaGeleneksel.selamVer());
        System.out.println(merhabaGeleneksel.besArtir(20));
        System.out.println(merhabaGeleneksel.birlestir("ata","mert"));
    }
    @Override
    public String selamVer() {
        return "Merhaba";
    }

    @Override
    public int besArtir(int a) {
        return a + 5;
    }

    @Override
    public String birlestir(String a, String b) {
        return a + " " + b;
    }
}

interface ISelamVer {
    String selamVer();
}

interface IBesArtir {
    int besArtir(int a);
}

interface IBirlestir {
    String birlestir(String a, String b);
}
