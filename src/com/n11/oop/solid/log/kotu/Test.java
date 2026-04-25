package com.n11.oop.solid.log.kotu;

public class Test
{
    static void main(String[] args) {

        XmlLog xmlLog = new XmlLog();
        DbLog dbLog = new DbLog();
        Logger logger = new Logger(xmlLog,dbLog);
        logger.LogKayit(LogType.Db," 303 nolu hata kodu olustu");
        logger.LogKayit(LogType.Xml,"303 nolu hata kodu olustu");
    }
}
