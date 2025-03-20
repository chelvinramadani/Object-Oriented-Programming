/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public final class Kubus {
    private final int sisi;
    private int volume;

    public Kubus(int sisi) {
        this.sisi = sisi;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        this.volume = sisi * sisi * sisi;
    }

    public double getVolume() {
        return this.volume;
    }
}
