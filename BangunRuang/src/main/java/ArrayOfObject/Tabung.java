/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Tabung {
    double radius, tinggi, volume;
 
    public Tabung(double radius, double tinggi){
    this.radius = radius;
    this.tinggi = tinggi;
    computeAndSetVolume();
    }
    
    private void computeAndSetVolume(){
    volume = Math.PI * Math.pow(radius, 2) * tinggi;
 }

    public double getVolume(){
    return volume;
  }
}
