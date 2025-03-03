/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motor;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainMotor {
     public static void main(String[] args) {
        // Membuat objek Motor dengan constructor
        motor motor1 = new motor("Honda", "PCX", "Merah", 2022);
        motor motor2 = new motor("Yamaha", "Aerox", "Hitam", 2020);
        motor motor3 = new motor("Honda", "Vario", "Putih", 2021);
        motor motor4 = new motor("Yamaha", "XMAX", "Merah", 2019);

        // Menampilkan informasi Motor
        System.out.println("Informasi Motor 1:");
        motor1.infomotor();
        System.out.println();

        System.out.println("Informasi Motor 2:");
        motor2.infomotor();
        System.out.println();

        System.out.println("Informasi Motor 3:");
        motor3.infomotor();
        System.out.println();
        
        System.out.println("Informasi Motor 4:");
        motor4.infomotor();
    }
}
