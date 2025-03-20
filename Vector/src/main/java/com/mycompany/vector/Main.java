/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Main {
    public static void main(String[] args){
     Vector3 v1 = new Vector3(1, 2, 3);
     Vector3 v2 = new Vector3(4, 5, 6);
    
    Vector3 hasil1 = v1.perkalian(5);
    System.out.println("vektor 1 * 5 = " + hasil1);
    
    int hasil2 = v1.perkalian(v2);
    System.out.println("vektor 1 * vektor 2 = " + hasil2);
   
    }
}
