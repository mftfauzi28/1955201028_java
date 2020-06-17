/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochamadmiftakhulfauzi_uts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 7
 */
public class BUFFREDREADER {
    public static void main(String[] args) {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     System.out.println("Masukkan Nama..."); 
     System.out.println("Masukkan tanggal lahir ..."); 
     System.out.println("Masukkan alamat ..."); 
     try {
     String nama = br.readLine(); 
     String tgl = br.readLine(); 
     String al = br.readLine(); 
     System.out.println("Selamat datang " + nama); 
     System.out.println("Data kamu sebagai berikut : "); 
     System.out.println("Tanggal lahir : "+ tgl);
     System.out.println("Alamat : "+ al);
     } 
     catch (IOException ex) 
     {
     }  
    }
}
