package com.belajaroverloading;

public class ContohOverLoading {
    public void jumlah(int a, int b)
    {
        System.out.println("jumlah 2 angka = " + (a+b));
    }

    //jumlah parameter berbeda
    public void jumlah(int a, int b, int c){
        System.out.println("jumlah 2 angka = " + (a+b+c));
    }

    //urutan tipe data yang berbeda
    public void jumlah(double a, int b){
        System.out.println("jumlah 2 angka (double+int)= " + (a+b));
    }

    //urutan tipe data yang berbeda
    public void jumlah(int b, double a){
        System.out.println("jumlah 2 angka (int+double)= " + (b+a));
    }
}
