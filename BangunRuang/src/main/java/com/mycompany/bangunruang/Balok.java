/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Balok {
    private final int panjang;
    private final int lebar;
    private final int tinggi;
    private int volume;
    
    public Balok(int panjang_baru, int lebar_baru, int tinggi_baru){
     panjang = panjang_baru;
     lebar = lebar_baru;
     tinggi = tinggi_baru;
     computeAndSetVolume();
 }
    
    private void computeAndSetVolume(){
    volume = panjang * lebar * tinggi;
 }

    public int getVolume(){
    return volume;
  }
}
