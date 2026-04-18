package com.n11.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ClassIsmi nesneAdi = new ClassIsmi();


       // Insan i = new  Insan(); // bunu artik yazamassin cunku Insan abstract class oldu yani tamamlanamayan
                                  // nesene vermeyen bir function artik
        Insan a = new Anne ();
        a.ad = "Sabriye";
        a.soyad = "Turan";
        a.kisibilgi();

        Insan b = new Baba ();
        b.ad = "Engin";
        b.soyad = "Turan";
        b.kisibilgi();

        Insan c = new Cocuk () ;
        c.ad = "Yigit";
        c.soyad = "Irfan Turan";
        c.kisibilgi();




    }
}