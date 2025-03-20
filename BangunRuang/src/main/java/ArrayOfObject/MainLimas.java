/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayOfObject;

/**
 *
 * @author CHELVIN RAMADANI
 */
public class MainLimas {
    public static void main(String[] args) {
        Limas[] limasArray = new Limas[5];
        limasArray[0] = new Limas(3, 4);
        limasArray[1] = new Limas(4, 6);
        limasArray[2] = new Limas(7, 3);
        limasArray[3] = new Limas(3, 5);
        limasArray[4] = new Limas(6, 2);

       int totalVolume = 0;
       for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Volume Limas ke-" + (i + 1) + ": " + limasArray[i].getVolume());
            totalVolume += limasArray[i].getVolume();
        }
         int rataRataVolume = totalVolume / limasArray.length;
        System.out.println("Rata-rata volume limas : " + rataRataVolume);
    }
}
