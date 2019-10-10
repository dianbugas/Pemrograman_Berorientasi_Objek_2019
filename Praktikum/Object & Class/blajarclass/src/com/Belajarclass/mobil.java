package com.Belajarclass;

public class mobil {
    private String jenis;
    private String merek;
    private int cc;

    public mobil(String jenis, String merek, int cc){
        this.jenis = jenis;
        this.merek = merek;
        this.cc = cc;
    }

    public void inJenis(String jenis) {
        this.jenis = jenis;
    }

    public void inMerek(String merek) {
        this.merek = merek;
    }

    public void inCC(int cc) {
        this.cc = cc;
    }

    public String perolehjenis(){
        return jenis;
    }

    public String perolehmerek(){
        return merek;
    }

    public int perolehcc(){
        return cc;
    }
}
