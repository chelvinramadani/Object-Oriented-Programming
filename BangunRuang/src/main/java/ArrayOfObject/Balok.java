/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Balok {
    private final int panjang, lebar, tinggi;
    private int volume;
    
    public Balok( int panjang, int lebar, int tinggi){
     this.panjang = panjang;
     this.lebar = lebar;
     this.tinggi = tinggi;
     computeAndSetVolume();
    }
    
    public void computeAndSetVolume(){
    volume = panjang * lebar * tinggi;
 }

    public int getVolume(){
    return volume;
  }
}
