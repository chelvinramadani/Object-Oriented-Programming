/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainEllipse {
   public static void main(String[] args) {
  
        Ellipse elips1 = new Ellipse();
        
        elips1.setSemiMajorAxis(14);
        elips1.setSemiMinorAxis(15);

        System.out.println("Sumbu Semi-Mayor: " + elips1.getSemiMajorAxis());
        System.out.println("Sumbu Semi-Minor: " + elips1.getSemiMinorAxis());
        System.out.println("Luas Elips: " + elips1.getLuas());
        System.out.println("Keliling Elips: " + elips1.getKeliling());
    }
}
