/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/** 
 *
 * @author dian
 */
public class Hewan {
    int tinggi = 140;
    String warna = "putih";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan kambing = new Hewan();
        kambing.berjalan();
    }
    
    void berjalan(){
        System.out.println("berjalan embek embek");
    }
}
