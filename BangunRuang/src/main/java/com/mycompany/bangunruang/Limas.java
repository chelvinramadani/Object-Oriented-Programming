/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Limas {
    private final int sisi;
    private final int tinggi;
    private int volume;
    
    public Limas(int input_sisi, int input_tinggi){
    sisi = input_sisi;
    tinggi = input_tinggi;
    computeAndSetVolume();
 }
    
    private void computeAndSetVolume(){
    volume = (sisi * sisi) * tinggi / 3;
 }
    
    public int getVolume(){
    return volume;
  }
}
