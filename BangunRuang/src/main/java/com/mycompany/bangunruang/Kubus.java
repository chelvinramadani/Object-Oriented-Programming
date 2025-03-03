/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Kubus {
 private final int sisi;
 private int volume;
 
 public Kubus(int sisi_baru){
     sisi = sisi_baru;
     computeAndSetVolume();
 }
 
 private void computeAndSetVolume(){
 volume = sisi * sisi * sisi;
 }
        
  public int getLuas(){
      return 6 * (sisi * sisi);
  }  
  
    public int getVolume(){
      return volume;
  }
}
