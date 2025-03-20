/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Balok {
    int panjang, lebar, tinggi, volume;
    
    public Balok(){
     this.panjang = 0;
     this.lebar = 0;
     this.tinggi = 0;
 }
    
     public Balok( int panjang, int lebar, int tinggi){
     this.panjang = panjang;
     this.lebar = lebar;
     this.tinggi = tinggi;
     computeAndSetVolume();
 }
     
     public void setPanjang( int panjang){
     this.panjang = panjang;
     computeAndSetVolume();
 }
     
     public void setLebar( int lebar){
     this.lebar = lebar;
     computeAndSetVolume();
 }
          
     public void setTinggi( int tinggi){
     this.tinggi = tinggi;
     computeAndSetVolume();
 }
    
    public void computeAndSetVolume(){
    volume = panjang * lebar * tinggi;
 }

    public int getVolume(){
    return volume;
  }
}
