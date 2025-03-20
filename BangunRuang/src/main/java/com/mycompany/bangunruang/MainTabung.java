/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainTabung {
    public static void main(String[] args){
    Tabung tabung1 = new Tabung();
    tabung1.setRadius(7);
    tabung1.setTinggi(5);
    
    Tabung tabung2 = new Tabung(14, 10);
    
    System.out.println("Volume Tabung = " +tabung1.getVolume());
    System.out.println("Volume Tabung = " +tabung2.getVolume());
    
    }
}
 