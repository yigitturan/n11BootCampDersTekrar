package com.n11.oop.solid.log.iyi;

public class Test {

    static void main(String[] args) {

        DbLog dbLog = new DbLog();
        XmlLog xmlLog = new XmlLog();
        Logger logger = new Logger(xmlLog);
        logger.LogYaz("303 nolu hata kodu olustu");
    }
}
