/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainLimas {
    public static void main(String[] args){
        
    Limas limas1 = new Limas();
    limas1.setSisi(6);
    limas1.setTinggi(3);
    
    Limas limas2 = new Limas(8, 12);
    
    System.out.println("Volume Limas = " +limas1.getVolume());
    System.out.println("Volume Limas = " +limas2.getVolume());
    
    }
}
