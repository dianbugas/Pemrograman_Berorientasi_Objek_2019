package com.BacaFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama file mary: ");
        String fileNameMasuk = input.next();
        System.out.print("masukkan file yg mau di isi: ");
        String fileNameKeluar = input.next();
        input.close();
        File fileMasuk = new File(fileNameMasuk);
        Scanner in = null;
        File fileKeluar = new File(fileNameKeluar);
        PrintWriter out = null;
        try {
            in = new Scanner(fileMasuk);
            out = new PrintWriter(fileKeluar);
        } catch (FileNotFoundException e1) {
            System.out.println("File tidak ditemukan!");
        }
        int lineNumber = 1;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            out.write(String.format("/* %d */ %s\n", lineNumber, line));
            lineNumber++;
        }
        out.close();
        in.close();
        System.out.println("Kedua File telah dibaca dan ditulis!");
    }
}