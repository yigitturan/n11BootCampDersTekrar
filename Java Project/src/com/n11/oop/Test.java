package com.n11.oop;

public class Test {
    public static void main(String[] args) {

        Goz goz = new Goz("Kahverengi ");
        Kulak kulak = new Kulak("Kepce ");
        Burun burun = new Burun("kemer ");
        Kafa kafa = new Kafa(goz,kulak,burun);
        YeniInsan yeni = new YeniInsan(kafa," ibrahim "," gokyar ");
        yeni.ekranaYaz();

        YeniInsan yeni2 = new YeniInsan(kafa," yigit ", " turan ");
        yeni2.ekranaYaz();
    }

}
