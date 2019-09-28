/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungangkatertentu;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class MenghitungAngkaTertentu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka, jumlah = 0;
        Scanner in = new Scanner(System.in);
        do
        {
        System.out.print("Masukkan angka : ");
        angka = in.nextInt();
        jumlah = jumlah + angka;
        }
        while(angka != 0);
        System.out.println("\nAnda telah memasukkan angka 0");
        System.out.println("Jumlah angka sebelumnya adalah " + jumlah);
    }
    
}
