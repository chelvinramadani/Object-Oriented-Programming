/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Bola {
   double radius, volume;
   
   public Bola(){
   this.radius = 0;
   }
     
    public Bola(double radius){
    this.radius = radius;
    computeAndSetVolume();
    }
    
    public void setRadius(double radius){
    this.radius = radius;
    computeAndSetVolume();
    }
    
    void computeAndSetVolume(){
    volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
 }
    
    public double getVolume(){
    return volume;
  }
}
