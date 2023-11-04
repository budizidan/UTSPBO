/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

import java.util.Scanner;



public class SoalNo4 {
    public static int[] data = null;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jmlangka = 10;
        int total;
total = 0;
        data = new int[jmlangka];

        for (int x = 0; x < data.length; x++) {
            System.out.print("Masukkan data ke-" + (x + 1) + " : ");
            data[x] = scan.nextInt();
        }   
        
        for (int x = 0; x < data.length; x++) {
           //total= data[x];
total = total + data[x];
//           System.out.print(data[x] + " ");
        }
        
        System.out.print("Total angka = "+ total + " ");
        


    }
}