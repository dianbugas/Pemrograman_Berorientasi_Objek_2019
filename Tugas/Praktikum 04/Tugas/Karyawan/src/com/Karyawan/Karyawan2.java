package com.Karyawan;

public class Karyawan2 {
    String nama;
    String alamat;
    int usia;
    String email;
    private String id;

    public Karyawan2 (String nama, String alamat, int usia, String email, String id){
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.email = email;
        this.id = id;
    }

    public String tampilNama(){
        return nama;
    }

    public String tampilAlamat(){
        return alamat;
    }

    public int tampilUsia(){
        return usia;
    }

    public String tampilEmail(){
        return email;
    }

    public String tampilId(){
        return id;
    }

    public void ubahId(String id)
    {
        this.id = id;
    }
}
