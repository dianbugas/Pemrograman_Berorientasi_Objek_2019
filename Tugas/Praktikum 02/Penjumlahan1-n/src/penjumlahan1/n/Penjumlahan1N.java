/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjumlahan1.n;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class Penjumlahan1N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i, hasil = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        n = in.nextInt();
        for(i = 1; i <= n; i++)
        {
        hasil = hasil + i;
        }
        System.out.println("Hasil Penjumlahan dari 1 sampai " + n + " : " +
        hasil);

    }
    
}
