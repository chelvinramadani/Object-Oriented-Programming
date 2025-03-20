/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Bola {
    private final double radius;
    private double volume;

    public Bola(double radius) {
        this.radius = radius;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
       this.volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double getVolume() {
        return this.volume;
    }
}
