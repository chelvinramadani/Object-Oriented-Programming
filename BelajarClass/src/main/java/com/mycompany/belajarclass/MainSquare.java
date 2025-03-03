/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainSquare {
    public static void main(String[] args){
    Square kotak1 = new Square();
    kotak1.setSisi(5);
    System.out.println("sisi persegi = " +kotak1.getSisi());
    System.out.println("luas persegi = " +kotak1.getLuas());
    System.out.println("Keliling persegi = " +kotak1.getKeliling());
  
    }
}