package com.n11.oop;

    abstract class Insan {
    public String ad;
    public String soyad;
    public int yas;
    public double maas;
    public boolean cinsiyet;

    /*
    // bunun icindeki yani methodun icindeki body i artik kullanamassin,
    bu abstraction, yani cagiran class , bu nu kullanmak zorunda , ama body burda degil orda ,
    zaten amacta bu , boylece orda o classa ozel sekilde kullanilip , ayni fonksiyon bir cok farkli classta
    farkli sekilde kullanilabiliyor -- polymorphisim + abstraction yapisi

     abstract void kisibilgi() {
        System.out.println("Kisinin Adi: " + ad + "kisinin soyAdi: " + soyad);
    }

     */
    abstract void kisibilgi();

}

