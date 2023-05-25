package com.atamertc.sabah.threadNeIseYarar.b_02;

public class MerhabaLambda {
    public static void main(String[] args) {
        ISelamVer2 iSelamVer2 = () -> "Merhaba Lambda";
        System.out.println(iSelamVer2.selamVer2());

        IBesArtir2 iBesArtir2 = (x) -> x + 5;
        System.out.println(iBesArtir2.besArtir2(20));

        IBirlestir2 iBirlestir2 = (x, y) -> x + " " + y;
        System.out.println(iBirlestir2.birlestir2("ata","mert"));
    }
}
@FunctionalInterface
interface ISelamVer2 {
    String selamVer2();

}

interface IBesArtir2 {
    int besArtir2(int a);
}

interface IBirlestir2 {
    String birlestir2(String a, String b);
}