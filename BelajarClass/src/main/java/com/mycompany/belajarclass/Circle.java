/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Circle {
    private double radius;
 
  public void setradius(double input_radius){
 radius = input_radius;
 }
    
    public double getradius(){
     return radius;
 }
    
    public double getLuas(){
     return Math.PI * (radius * radius);
  }
      
    public double getKeliling(){
     return 2 * Math.PI * radius;
  }
}