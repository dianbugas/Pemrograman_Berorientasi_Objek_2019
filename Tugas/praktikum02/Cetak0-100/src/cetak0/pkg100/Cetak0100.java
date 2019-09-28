/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetak0.pkg100;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class Cetak0100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Enter an integer < 100 : ");
            value = in.nextInt();
            if(0 < value && value < 100)
            {
            System.out.println("Angka termasuk diantara 0 dan 100 yaitu : " + value);
            }
            else
            {
            System.out.println("Angka bukan termasuk diantara 0 dan 100 yaitu : " + value);
            }
        }
        while(value >= 100);
    }
}
