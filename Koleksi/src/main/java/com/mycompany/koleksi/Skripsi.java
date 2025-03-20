/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.koleksi;

/**
 *
 * @author CHELVIN RAMADANI
 */
class Skripsi extends Buku {

    private final String NPM;
    
    public Skripsi(String NPM, String judul, String penulis, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    
    @Override
    public String toString(){
    return super.toString() + ", NPM: " + NPM;
    }
    
}
