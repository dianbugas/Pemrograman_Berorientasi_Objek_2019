package com.koverter;
import javax.swing.JOptionPane;

public class DollarToRupiah implements iConverter{
    @Override
    public double convert(double input) {
        double hasil;
        hasil = (input * 15000);
        JOptionPane.showMessageDialog(null,"Dollar to Rupiah : " + hasil);
        return hasil;
    }
    
}
