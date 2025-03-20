/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainBola {
    public static void main(String[] args) {
        Bola[] bolaArray = new Bola[5];
        double[] radiusValues = {5, 7, 10, 3, 2}; 

        for (int i = 0; i < bolaArray.length; i++) {
            bolaArray[i] = new Bola(radiusValues[i]);
        }

       double totalVolume = 0;
       for (int i = 0; i < bolaArray.length; i++) {
            System.out.println("Volume Bola ke-" + (i + 1) + ": " + bolaArray[i].getVolume());
            totalVolume += bolaArray[i].getVolume();
        }
         double rataRataVolume = totalVolume / bolaArray.length;
        System.out.println("Rata-rata volume bola : " + rataRataVolume);
    }
}
