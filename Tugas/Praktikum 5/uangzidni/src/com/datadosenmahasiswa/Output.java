package com.datadosenmahasiswa;

public class Output {
    public static void main(String []args){
        Dosen dosen = new Dosen("Pak hilmi", "Depok", 29, 01121322);
        Mahasiswa mahasiswa = new Mahasiswa("dian", "pontianak", 20, 021212121, "TI", 3.0f);

        System.out.println("=========== DOSEN ==========="  );
        dosen.info();

        System.out.println("=========== Mahasiswa ========");
        mahasiswa.info();
    }
}
