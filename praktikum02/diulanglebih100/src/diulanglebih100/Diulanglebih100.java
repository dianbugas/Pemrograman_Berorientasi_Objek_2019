/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diulanglebih100;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class Diulanglebih100 {

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
        }
        while(value >= 100);
    }
    
}
