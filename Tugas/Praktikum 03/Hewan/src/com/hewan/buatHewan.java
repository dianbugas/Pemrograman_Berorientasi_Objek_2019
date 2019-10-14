package com.hewan;

public class buatHewan {
    public static void main(String args[])
    {
        Hewan kucing = new Hewan();
        Hewan kelinci = new Hewan();
        kucing.jenis = "Anggora";
        kelinci.jenis = "Australia";
        kucing.kaki = 4;
        kucing.warna = "Putih";
        kucing.habitat = "Darat";
        kucing.suara("Meooooong");
        String makanankucing = kucing.Makanan("Ikan");
        System.out.print("Jenis Kucing : " + kucing.jenis + "\nJenis Kelinci : " + kelinci.jenis +
                "\nBanyak Kaki Kucing : " + kucing.kaki + "\nWarna Kucing : " + kucing.warna +
                "\nHabitat Kucing : " + kucing.habitat + "\nMakanan Kucing : " + makanankucing);
        System.out.println();
    }
}
