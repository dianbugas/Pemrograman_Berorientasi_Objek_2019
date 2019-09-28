/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetakgenap;

/**
 *
 * @author dian
 */
public class CetakGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 12;
        System.out.print("Angka Genap Antara 10 dan 20 : ");
        while(angka < 20)
        {
        System.out.print(angka + " ");
        angka += 2;
        }
        System.out.println();
    }
    
}
