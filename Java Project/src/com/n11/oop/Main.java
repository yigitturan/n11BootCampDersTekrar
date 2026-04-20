package com.n11.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ClassIsmi nesneAdi = new ClassIsmi();


       // Insan i = new  Insan(); // bunu artik yazamassin cunku Insan abstract class oldu yani tamamlanamayan
                                  // nesene vermeyen bir function artik

        Anne a = new Anne ();
        a.ad = "Sabriye";
        a.soyad = "Turan";
        a.kisibilgi(a.ad,a.soyad);

        // interface sayesinde anne okuyup yazabilir fakat dinleyi yazamaz yani kodu korumus oluruz
        // interface yerine classin icine yazsak, anne dinleyide kullanir ,
        // ve baba bu ozelligide kullanamaz tanimlamadigimiz icin annenin icine
        //yani interface ile kodu koruyoruz , yani babada string name degil string adi kullanmamizi zorunlu tutuyor,
        //butunluk sagliyor ve kodu okuma ,yazarken methodu cagirma erisme anlamindada kolaylik sagliyor

        a.oku(a.ad);
        a.yaz(a.ad);

        Baba b = new Baba ();
        b.ad = "Engin";
        b.soyad = "Turan";
        b.kisibilgi(b.ad,b.soyad);

        Cocuk c = new Cocuk () ;
        c.ad = "Yigit";
        c.soyad = "Irfan Turan";
        c.kisibilgi(c.ad,c.soyad);
        c.sifat = "UsluCocuk";

        AkilliCocuk ak = new AkilliCocuk();
        ak.ad = "Hakan";
        ak.soyad = "Yilmaz";
        ak.sifat = "Akillidir";
        ak.adSoyadSifatYaz(ak.ad,ak.soyad,ak.sifat);

        UsluCocuk us = new UsluCocuk();
        us.adSoyadSifatYaz("Mehmet","Yildiz","Usludur");




    }
}