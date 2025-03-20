/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Tabung {
    double radius, tinggi, volume;
    
    public Tabung(){
    this.radius = 0;
    this.tinggi = 0;
    }
 
    public Tabung(double radius, double tinggi){
    this.radius = radius;
    this.tinggi = tinggi;
    computeAndSetVolume();
    }
    
    public void setRadius(double radius){
        this.radius = radius;
        computeAndSetVolume();
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
        computeAndSetVolume();
    }
    
    private void computeAndSetVolume(){
    volume = Math.PI * Math.pow(radius, 2) * tinggi;
 }

    public double getVolume(){
    return volume;
  }
}
