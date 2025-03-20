/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainKubus {
     public static void main(String[] args) {
        Kubus[] kubusArray = new Kubus[5];
        int[] sisiValues = {3, 4, 5, 6, 7}; 

        for (int i = 0; i < kubusArray.length; i++) {
            kubusArray[i] = new Kubus(sisiValues[i]);
        }

       int totalVolume = 0;
       for (int i = 0; i < kubusArray.length; i++) {
            System.out.println("Volume kubus ke-" + (i + 1) + ": " + kubusArray[i].getVolume());
            totalVolume += kubusArray[i].getVolume();
        }
         int rataRataVolume = totalVolume / kubusArray.length;
        System.out.println("Rata-rata volume kubus: " + rataRataVolume);
    }
}
