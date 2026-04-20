package com.n11.oop;

public class YeniInsan {

    public Kafa kafa;
    public String ad;
    public String soyad;

    public YeniInsan(Kafa kafa,String ad,String soyad)
    {
        this.kafa = kafa;
        this.ad = ad;
        this.soyad = soyad;
    }

    public void ekranaYaz()
    {
        System.out.println("Kisinin adi :" + ad + "soyad" + soyad + "goz rengi: "
                + kafa.goz.renk + "kulagi: " + kafa.kulak.sekil + "burunu:" + kafa.burun.tip);
    }
}
