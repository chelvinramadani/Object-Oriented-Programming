/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Rectangle {

private int panjang;
private int lebar;
    
 public void setPanjang(int input_panjang){
 panjang = input_panjang;
 }
 
  public void setLebar(int input_lebar){
 lebar = input_lebar;
 }
 
   public int getPanjang(){
     return panjang;
 }
   
    public int getLebar(){
     return lebar;
 }
    
    public int getLuas(){
      return panjang * lebar;
  } 
    
  public int getKeliling(){
      return 2 * (panjang + lebar);
  }
}
