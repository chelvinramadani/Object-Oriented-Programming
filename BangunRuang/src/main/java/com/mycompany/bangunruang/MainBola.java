/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainBola {
    public static void main(String[] args){
        Bola bola1 = new Bola(10);
        Bola bola2 = new Bola(11);
        Bola bola3 = new Bola(12);

        System.out.println("Volume bola 1 = " +bola1.getVolume());
        System.out.println("Volume bola 2 = " +bola2.getVolume());
        System.out.println("Volume bola 3 = " +bola3.getVolume());
    }
}
