/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarclass;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Ellipse {
    private double semiMajorAxis; 
    private double semiMinorAxis;
    
    
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    // Setter untuk mengubah sumbu semi-mayor
    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    // Setter untuk mengubah sumbu semi-minor
    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

     public double getLuas() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    // Method untuk menghitung keliling elips (menggunakan pendekatan Ramanujan)
    public double getKeliling() {
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) 
                - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }

}
