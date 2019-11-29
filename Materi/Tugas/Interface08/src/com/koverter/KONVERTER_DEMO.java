package com.koverter;
import javax.swing.JOptionPane;

public class KONVERTER_DEMO {
    public static void main(String[] args) {
        RupiahToDollar c1 = new RupiahToDollar();
        DollarToRupiah c2 = new DollarToRupiah();
        CelciusToFahrenheit c3 = new CelciusToFahrenheit();
        FahrenheitToCelcius c4 = new FahrenheitToCelcius();
        
        iConverter[] pilihanKonverter = {c1,c2,c3,c4};
        
        String str_pilihan = JOptionPane.showInputDialog(
                "Pilih konverter:\n"
                + "1. Rupiah ke Dollar\n"
                + "2. Dollar ke Rupiah\n"
                + "3. Celcius ke Fahrenheit\n"
                + "4. Fahrenheit ke Celius");
        int pilihan = Integer.parseInt(str_pilihan);
        iConverter converterDipilih = pilihanKonverter[pilihan-1];
        
        String str_input = JOptionPane.showInputDialog(
                "Masukkan nilai input");
        double input = Double.parseDouble(str_input);
        double hasil = converterDipilih.convert(input);

    }
    
}
