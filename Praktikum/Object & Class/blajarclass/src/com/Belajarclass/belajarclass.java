package com.Belajarclass;

public class belajarclass {
    public static void main(String []args){
        mobil sedan = new mobil("CITY","honda",160);

//        sedan.inJenis("CITY");
//        sedan.inMerek("honda");
//        sedan.inCC(1600);

        sedan.inCC(2000);

        System.out.println("Sedan");
        System.out.println("jenis :" + sedan.perolehjenis());
        System.out.println("merek :" + sedan.perolehmerek());
        System.out.println("CC :" + sedan.perolehcc());
    }
}
