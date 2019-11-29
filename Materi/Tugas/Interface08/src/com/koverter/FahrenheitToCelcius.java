package com.koverter;
public class FahrenheitToCelcius implements iConverter{
    @Override
    public double convert(double input) {
        double hasil;
        hasil = ((input - 32) * 5 / 9);
        System.out.print("Fahrenheit to Celcius : ");
        return hasil;
    }
    
}
