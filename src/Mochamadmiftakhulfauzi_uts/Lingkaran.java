/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochamadmiftakhulfauzi_uts;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 7
 */
public class Lingkaran {
        //Menghitung Luas dan Volume Bangun Datar
   public static void main(String[] args) {
   int jarijari;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Lingkaran");
   System.out.print("Masukan Jari-Jari: ");
   jarijari = scan.nextInt();
 
   luas = 3.14 * (jarijari * jarijari);
   System.out.println("Luas Lingkaran= " +luas);
    }
}

    

