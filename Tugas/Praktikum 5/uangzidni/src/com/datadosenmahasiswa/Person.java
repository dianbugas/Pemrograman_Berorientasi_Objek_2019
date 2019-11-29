package com.datadosenmahasiswa;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    String nama;
    String alamat;
    int umur;

    public Person(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public void info(){
        System.out.println("nama : " + nama);
        System.out.println("alamat : " + alamat);
        System.out.println("umur : " + umur);
    }
}
