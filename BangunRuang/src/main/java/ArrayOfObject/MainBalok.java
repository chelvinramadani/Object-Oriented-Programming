/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainBalok {
    public static void main(String[] args) {
        Balok[] balokArray = new Balok[5];
        balokArray[0] = new Balok(3, 4, 5);
        balokArray[1] = new Balok(4, 5, 6);
        balokArray[2] = new Balok(6, 7, 8);
        balokArray[3] = new Balok(3, 1, 5);
        balokArray[4] = new Balok(6, 4, 2);

       int totalVolume = 0;
       for (int i = 0; i < balokArray.length; i++) {
            System.out.println("Volume Balok ke-" + (i + 1) + ": " + balokArray[i].getVolume());
            totalVolume += balokArray[i].getVolume();
        }
         int rataRataVolume = totalVolume / balokArray.length;
        System.out.println("Rata-rata volume Balok: " + rataRataVolume);
    }
}
