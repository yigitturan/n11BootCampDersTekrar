package com.n11.oop.solid.log.kotu;

public class Logger {

    private DbLog dbLog;
    private XmlLog xmlLog;


    public Logger(XmlLog xmlLog, DbLog dbLog)
    {
        this.xmlLog = xmlLog;
        this.dbLog = dbLog;

    }

    public void LogKayit(LogType type, String value)
    {
        switch(type)
        {
            case Xml:
                xmlLog.xmlKayit(value);
                break;
            case Db:
                dbLog.dbKayit(value);
                break;
        }
    }

}