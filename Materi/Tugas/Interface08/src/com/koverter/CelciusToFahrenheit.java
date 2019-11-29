package com.koverter;
import javax.swing.JOptionPane;

public class CelciusToFahrenheit implements iConverter{
    @Override
    public double convert(double input) {
        double hasil;
        hasil = ((input * 9 / 5) + 32);
        JOptionPane.showMessageDialog(null,"Celcius to Fahrenheit : " + hasil);
        return hasil;
    }
    
}
