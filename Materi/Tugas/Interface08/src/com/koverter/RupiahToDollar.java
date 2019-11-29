package com.koverter;
import javax.swing.JOptionPane;


public class RupiahToDollar implements iConverter{
    @Override
    public double convert(double input) {
        double hasil;
        hasil = (input / 15000);
        JOptionPane.showMessageDialog(null,"Rupiah to Dollar : " + hasil);
        return hasil;
    }
    
}
