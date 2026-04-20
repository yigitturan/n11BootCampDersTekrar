package com.n11.oop.abstracts;

public class Test {
    public static void main(String[] args)
    {
        GenelMudur Gm = new GenelMudur();
        Gm.Pozisyon = "Genel Mudur";
        Gm.ad = "Hakan";
        Gm.soyad = "Yilmaz";
        Gm.Departman = "Genel Mudur";
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

        //DIZILER ORNEK

        Calisan[] calisanlar = new Calisan[4];
        calisanlar[0] = Gm;
        calisanlar[1] = m;
        calisanlar[2] = p;
        calisanlar[3] = s;

        for(int j=0 ; j< calisanlar.length ; j++)
        {
            System.out.println("Calisanin adi : " + calisanlar[j].ad +" soyadi: "+  calisanlar[j].soyad + " maas: " + calisanlar[j].Maas);
        }

        // Overload method ornek  :
        Matematik ma = new Matematik();
        int gelendeger = ma.topla(5,5);
        System.out.println("iki sayinin toplami : " + gelendeger);


    }
}
