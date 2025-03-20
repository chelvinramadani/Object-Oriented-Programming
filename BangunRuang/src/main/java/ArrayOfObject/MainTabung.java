/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainTabung {
    public static void main(String[] args) {
        Tabung[] tabungArray = new Tabung[5];
        tabungArray[0] = new Tabung(7, 10);
        tabungArray[1] = new Tabung(4, 5);
        tabungArray[2] = new Tabung(6, 7);
        tabungArray[3] = new Tabung(3, 5);
        tabungArray[4] = new Tabung(6, 4);

       int totalVolume = 0;
       for (int i = 0; i < tabungArray.length; i++) {
            System.out.println("Volume Tabung ke-" + (i + 1) + ": " + tabungArray[i].getVolume());
            totalVolume += tabungArray[i].getVolume();
        }
         int rataRataVolume = totalVolume / tabungArray.length;
        System.out.println("Rata-rata volume Tabung: " + rataRataVolume);
    }
}
