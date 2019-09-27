/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_percabangan;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class If_percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        int b = 0;
        Scanner masuk = new Scanner(System.in);
            System.out.print("Masukkan Angka Pertama : ");
                a = masuk.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
                b = masuk.nextInt();
            if(a > b)
            {
                System.out.println("Angka pertama lebih besar dari angka kedua");
            }
                else if(a == b)
            {
                System.out.println("Angka pertama sama dengan angka kedua");
            }
                 else
            {
                System.out.println("Angka kedua lebih besar dari angka pertama");
            }
                }
    
}
