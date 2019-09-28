/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg100whilelop;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value = 0;
        Scanner in = new Scanner(System.in);
        while(100 > value)    
            {
                if(100 > value){
                System.out.print("Enter an integer < 100 : ");

                }else if(value > 100){
                System.out.println("angka yang anda input lebih dari 100");
                
                }
                value = in.nextInt();
        }
    }
}
