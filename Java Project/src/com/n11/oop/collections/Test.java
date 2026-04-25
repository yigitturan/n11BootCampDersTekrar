package com.n11.oop.collections;

import com.n11.oop.Insan;

import java.util.ArrayList;

public class Test {

    static void main(String[] args) {

       // ArrayList<String> list = new ArrayList();
        // eger String yaparsak bastan diger veri tiplerini engelliyor bu da generic demek oluyor performans icin

        ArrayList list = new ArrayList(); // suan kisitlama yok
        Insan i = new Insan();
        list.add("ibrahim");
        list.add(3.14);
        list.add(35);
        list.add(true);
        list.add(i);

        if(list.contains(i))
        {
            System.out.println("listede var ");
        }
        else
        {
            System.out.println("listede yok ");
        }

        ArrayList<Personel> personelListesi = new ArrayList<Personel>();
        Personel p1 = new Personel("hakan","yilmaz",3000);
        Personel p2 = new Personel("Yigit","irfan",5000);
        personelListesi.add(p1);
        personelListesi.add(p2);

        double maasToplami = 0.0;

        for(Personel p : personelListesi)
        {
            System.out.println("Personel adi: " + p.ad + "soyadi: " + p.soyad + "maas:" + p.maas);
            maasToplami += p.maas;

        }
        System.out.println("toplam maas: " + maasToplami);
    }
}
