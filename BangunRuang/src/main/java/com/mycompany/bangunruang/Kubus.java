/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Kubus {
 private int sisi;
 private int volume;
 
 public Kubus(){
     this.sisi = 0;
 }
 
 public Kubus(int sisi){
     this.sisi = sisi;
     computeAndSetVolume();
 }
 
 public void setSisi(int sisi){
 this.sisi = sisi;
  computeAndSetVolume();
         }
 
 void computeAndSetVolume(){
 this.volume = sisi * sisi * sisi;
 }
  
    public int getVolume(){
      return this.volume;
  }
}
