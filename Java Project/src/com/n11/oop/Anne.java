package com.n11.oop;

import com.n11.oop.interfaces.IOku;
import com.n11.oop.interfaces.IYaz;

public class Anne extends Insan implements IOku, IYaz {

    public void oku(String adi) {
        System.out.print(adi + " okuyor");
    }

    public void yaz(String adi) {
        System.out.print(adi + " yaziyor");
    }

}
