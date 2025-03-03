/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainBalok {
    public static void main(String[] args){
    Balok balok1 = new Balok(7, 5, 3);
    Balok balok2 = new Balok(15, 8, 5);
    
    System.out.println("Volume balok 1 = " +balok1.getVolume());
    System.out.println("Volume balok 2 = " +balok2.getVolume());
    
    }
}