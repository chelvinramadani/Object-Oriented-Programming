/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Tabung {
    private final double radius;
    private final double tinggi;
    private double volume;
 
    public Tabung(double input_radius, double input_tinggi){
    radius = input_radius;
    tinggi = input_tinggi;
    computeAndSetVolume();
    }
    
    private void computeAndSetVolume(){
    volume = Math.PI * Math.pow(radius, 2) * tinggi;
 }

    public double getVolume(){
    return volume;
  }
}
