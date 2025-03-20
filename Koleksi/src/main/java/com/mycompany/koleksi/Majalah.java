/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.koleksi;

/**
 *
 * @author CHELVIN RAMADANI
 */
class Majalah extends Koleksi{
    private final String edisi;
    
    public Majalah(String judul, String edisi, String penerbit, int tahun){
    super(judul, penerbit, tahun);
    this.edisi = edisi;
    }
    
    @Override
    public String toString(){
    return super.toString() + ", Edisi: " + edisi;
    }
}
