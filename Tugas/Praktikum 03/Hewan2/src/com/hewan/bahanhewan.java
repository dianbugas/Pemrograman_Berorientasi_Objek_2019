package com.hewan;

public class bahanhewan {
    public static void main(String []args){
        hewan kucing = new hewan();
        hewan kelinci = new hewan();

        kucing.jenis = "anggora";
        kelinci.jenis = "australia";

        kucing.kaki = 4;
        kucing.warna = "hitam";
        kucing.habitat = "darat";

        kucing.suara("meaong");

        String makankucing = kucing.makanan("ikan");

        System.out.print("jenis kucing ; " + kucing.jenis + "\njenis kelinci ; " + kelinci.jenis +
                        "\nbanyaknya kaki kucing : " + kucing.kaki + "\nwarna kucing : " + kucing.warna +
                        // makanan kucing di ambil dari baris 17
                        "\nhabitat kucing : " + kucing.habitat + "\nmakanan kucing : " + makankucing);
        System.out.println();
    }
}
