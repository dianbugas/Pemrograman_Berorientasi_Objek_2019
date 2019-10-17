package com.pewarisan;

public class MilikAnak extends DariOrtu {
    //private hanya di lingkup satu file saja
    private String sepeda;
    public MilikAnak(){
        sepeda = "laragon00";
    }

    public void info()
    {
        System.out.println("uang : " + uang);
        System.out.println("mobil : " + mobil);
        System.out.println("sepeda : " + sepeda);
    }
}
