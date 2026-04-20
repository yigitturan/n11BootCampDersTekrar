package com.n11.oop.abstracts;

public class Test {
    public static void main(String[] args)
    {
        GenelMudur Gm = new GenelMudur();
        Gm.Pozisyon = "Genel Mudur";
        Gm.Maas = 300000;
        Gm.PozisyonMaas();

        Mudur m = new Mudur();
        m.Pozisyon = "Mudur ";
        m.Maas = 200000;
        m.PozisyonMaas();
        
        Programci p = new Programci();
        p.Pozisyon = "Programci";
        p.Maas = 150000;
        p.PozisyonMaas();
        
        Stajyer s = new Stajyer();
        s.Pozisyon = "Stajyer";
        s.Maas = 30000;
        s.PozisyonMaas();


        int toplamMaas = Gm.Maas + m.Maas + p.Maas + s.Maas;
        System.out.println("Toplam Maas: " + toplamMaas);


    }
}
