/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;
// mengimpor Scanner ke program
import java.util.Scanner;

/**
 *
 * @author dian
 */
public class Praktikum02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* for=============
        for(int a=0; a<5; a++){
            System.out.println("nilai dari a ke-" + a +"adalah " +a);
        }
        //while==========
        int a = 0;
        while(a<=5){
            System.out.println("nilai dari a ke-" + a +"adalah " +a);
        a++;
        }
        int a = 0;
        do{
             System.out.println("nilai dari a ke-" + a +"adalah " +a);
            a++;
        }
        while(a<=5);
        */
        int a = 0;
        int b = 0;
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukkan angka 1 - 3 : ");
        a = masuk.nextInt();
        
        switch(a){
            case 1 :
                System.out.println("ini angka satu");
                break;
            case 2 :
                System.out.println("ini angka kedua");
                break;
            case 3 :
                System.out.println("ini angka ke tiga");
                break;
            default :
                System.out.println("angka tidak sesuai");
        }
        
        
        
        /*
        System.out.print("masukkan angka kedua : ");
        b = masuk.nextInt();
        
        if(a > b){
            System.out.println("angka pertama lebih besar");
        }else if(a == b){
            System.out.println("angka pertama sama dengan angka kedua");
        }else{
            System.out.println("angka kedua lebih besar");
        }
        */
    }
    
}
