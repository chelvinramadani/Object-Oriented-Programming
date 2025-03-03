/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainRectangle {
    public static void main(String[] args){
    Rectangle persegipanjang1 = new Rectangle();
    persegipanjang1.setPanjang(15);
    persegipanjang1.setLebar(5);
    
    Rectangle persegipanjang2 = new Rectangle();
    persegipanjang2.setPanjang(25);
    persegipanjang2.setLebar(10);
    
    System.out.println("luas persegi panjang = " +persegipanjang1.getLuas());
    System.out.println("Keliling persegi panjang = " +persegipanjang1.getKeliling());
    
    System.out.println("luas persegi panjang = " +persegipanjang2.getLuas());
    System.out.println("Keliling persegi panjang = " +persegipanjang2.getKeliling());
  
    }
}
