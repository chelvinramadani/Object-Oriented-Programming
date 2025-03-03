/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class motor {
    private final String merk;
    private final String tipe;
    private final String warna;
    private final int tahun;

    // Constructor untuk inisialisasi objek
    public motor(String merk, String tipe, String warna, int tahun) {
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan informasi Motor
    public void infomotor() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tipe  : " + tipe);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }
}
