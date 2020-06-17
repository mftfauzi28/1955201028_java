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
public class PesegiPanjang {
    public static void main(String[] args) {
   int panjang;
   int lebar;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Persegi Panjang");
   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
 
   luas = (lebar * panjang);
   System.out.println("Luas Segi Panjang = " +luas);
    }
}

