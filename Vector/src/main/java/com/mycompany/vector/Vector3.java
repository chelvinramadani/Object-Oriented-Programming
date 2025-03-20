/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class Vector3 {
    private final int [] values;
    
    public Vector3(int x, int y, int z){
    this.values = new int[]{x, y, z};
    }
    
    public Vector3 perkalian(int scalar){
    return new Vector3(values[0] * scalar, values[1] * scalar, values[2] * scalar);
    }
    
    public int perkalian(Vector3 other){
    return (this.values[0] * other.values[0]) +
           (this.values[1] * other.values[1]) +
           (this.values[2] * other.values[2]);
    }
    
    @Override
    public String toString(){
    return "[" + values[0] + ", " + values[1] + ", " + values[2] + "]";
    }
    
}
