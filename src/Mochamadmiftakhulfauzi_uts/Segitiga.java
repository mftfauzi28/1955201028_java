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
public class Segitiga {
    public static void main(String[] args) {
   int alas;
   int tinggi;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.print("Masukan Alas: ");
   alas = scan.nextInt();
   System.out.print("Masukan Tinggi: ");
   tinggi = scan.nextInt();
 
   luas = ((alas * tinggi)/2);
   System.out.println("Luas Segitiga = " +luas);
    }
}

