/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajarjavapbo;

import java.util.Scanner;

public class BelajarJavaPBO {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah angka: ");
            int angka = input.nextInt();
            
            cekAngka objAngka = new cekAngka(angka);
            objAngka.cekGenapGanjil();
        }
    }
}
