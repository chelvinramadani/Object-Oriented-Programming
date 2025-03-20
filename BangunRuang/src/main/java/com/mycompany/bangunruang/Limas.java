/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Limas {
    int sisi, tinggi, volume;
    
    public Limas(){
        this.sisi = 0;
        this.tinggi = 0;
    }
    
    public Limas(int sisi, int tinggi){
    this.sisi = sisi;
    this.tinggi = tinggi;
    computeAndSetVolume();
 }
    
     public void setSisi( int sisi){
     this.sisi = sisi;
     computeAndSetVolume();
 }
    
     public void setTinggi( int tinggi){
     this.tinggi = tinggi;
     computeAndSetVolume();
 }
    
    public void computeAndSetVolume(){
    volume = (sisi * sisi) * tinggi / 3;
 }
    
    public int getVolume(){
    return volume;
  }
}
