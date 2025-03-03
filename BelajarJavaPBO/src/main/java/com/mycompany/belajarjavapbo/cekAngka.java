package com.mycompany.belajarjavapbo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class cekAngka {

    private final int nilai;
     
     public cekAngka(int nilai) {
         this.nilai = nilai;
    }
     
     public void cekGenapGanjil() {
        if (nilai % 2 == 0) {
            System.out.println("Angka yang Anda masukkan adalah genap.");
        } else {
            System.out.println("Angka yang Anda masukkan adalah ganjil.");
        }
    }

}
