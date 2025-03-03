/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Bola {
    private final double radius;
    private double volume;
     
    public Bola(double input_radius){
    radius = input_radius;
    computeAndSetVolume();
    }
    
    private void computeAndSetVolume(){
    volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
 }
    
    public double getVolume(){
    return volume;
  }
}
