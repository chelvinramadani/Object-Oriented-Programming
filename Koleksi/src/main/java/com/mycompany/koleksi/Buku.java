/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.koleksi;

/**
 *
 * @author CHELVIN RAMADANI
 */
class Buku extends Koleksi{
    private final String penulis;
    
    public Buku(String judul, String penulis, String penerbit, int tahun){
    super(judul, penerbit, tahun);
    this.penulis = penulis;
    }
    
    @Override
    public String toString(){
    return super.toString() + ", Penulis : " + penulis;
    }
}
