/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.koleksi;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Main {
    public static void main(String[] args){
    Buku buku1 = new Buku("Pemrograman Web untuk pemula", "Cahyo", "PT Informatika Maju", 2021);
    Skripsi skripsi1 = new Skripsi("23081010155", "Rancang Bangun Aplikasi Desa Maju", "Chelvin Ramadani Y", "Informatika UPN Veteran Jawa Timur", 2024);
    Majalah majalah1 = new Majalah("Pentingnya Bersedekah", "Edisi 67", "Nurul Hayat", 2022);
    
    Buku buku2 = new Buku("Panduan Ramban untuk Pemula", "Izzud", "PT Literasi Maju", 2020);
    Skripsi skripsi2 = new Skripsi("20081010120", "Analisi Regresi Linier untuk Memprediksi Kasus Korupsi", "Daniel Budianto", "Informatika UPN Veteran Jawa Timur", 2023);
    Majalah majalah2 = new Majalah("Berkah Ramadhan", "Edisi 66", "Nurul Hayat", 2022);
    
    System.out.println("Koleksi Buku");
    System.out.println(buku1);
    System.out.println(buku2);
    System.out.println("---------------------");
    System.out.println("Koleksi Skripsi");
    System.out.println(skripsi1);
    System.out.println(skripsi2);
    System.out.println("---------------------");
    System.out.println("Koleksi Majalah");
    System.out.println(majalah1);
    System.out.println(majalah2);
    
    }
}
