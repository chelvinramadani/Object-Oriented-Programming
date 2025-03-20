/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainKubus {
    public static void main(String[] args){
    Kubus kubus1 = new Kubus();
    kubus1.setSisi(6);
    kubus1.computeAndSetVolume();
    System.out.println("Volume kubus 1 = " +kubus1.getVolume());
    
    Kubus kubus2 = new Kubus(8);
    System.out.println("Volume kubus 2 = " +kubus2.getVolume());
    
    }
}
