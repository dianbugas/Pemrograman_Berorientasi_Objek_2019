/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swich;
import java.util.Scanner;

/**
 *
 * @author dian
 */
public class Swich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        Scanner baru = new Scanner(System.in);
        System.out.print("Masukkan satu angka dari angka 1 sampai 5 : ");
        a = baru.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("Ini angka satu");
            break;
            case 2:
            System.out.println("Ini angka dua");
            break;
            case 3:
            System.out.println("Ini angka tiga");
            break;
            case 4:
            System.out.println("Ini angka empat");
            break;
            case 5:
            System.out.println("Ini angka lima");
            break;
            default:
            System.out.println("Maaf angka yang dimasukkan tidak sesuai");
        }
        
    }
    
}
