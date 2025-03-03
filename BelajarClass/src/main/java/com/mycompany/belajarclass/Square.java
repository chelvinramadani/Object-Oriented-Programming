/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Square {
 private int sisi;
 
 public void setSisi(int input_sisi){
 sisi = input_sisi;
 }
 
 public int getSisi(){
     return sisi;
 }
         
  public int getLuas(){
      return sisi * sisi;
  }  
  
    public int getKeliling(){
      return 4 * sisi;
  }

}
