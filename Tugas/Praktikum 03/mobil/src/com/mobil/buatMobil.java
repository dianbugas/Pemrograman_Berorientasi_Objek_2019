package com.mobil;

public class buatMobil {
    public static void main(String []args){
        mobil minibus = new mobil();
        mobil sedan = new mobil();
        mobil truck = new mobil();
        mobil jip = new mobil();
        mobil bus = new mobil();

        minibus.nama = "Minibus";
        minibus.jenis = "Avanza";
        minibus.merek = "Toyota";
        minibus.cc = 1300;
        sedan.nama = "Sedan";
        sedan.jenis = "City";
        sedan.merek = "Honda";
        sedan.cc = 1600;

        System.out.println("Nama : " + minibus.nama);
        System.out.println("Jenis : " + minibus.jenis);
        System.out.println("Merek : " + minibus.merek);
        System.out.println("CC : " + minibus.cc);
        System.out.println();
        System.out.println("Nama : " + sedan.nama);
        System.out.println("Jenis : " + sedan.jenis);
        System.out.println("Merek : " + sedan.merek);
        System.out.println("CC : " + sedan.cc);

    }
}
