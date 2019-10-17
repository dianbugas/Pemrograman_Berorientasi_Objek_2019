package com.pewarisan;

public class DariOrtu {
    protected int uang;
    protected String mobil;

    public DariOrtu(){
        uang = 500000;
        mobil = "homda jes";
    }

    public void info(){
        System.out.println("Uang : + uang");
        System.out.println("Mobil : " + mobil);
    }
}
