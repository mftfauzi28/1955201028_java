/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochamadmiftakhulfauzi_uts;

import javax.swing.JOptionPane;

/**
import java.swing.JOptionPaneKalkulator;
 * @author WINDOWS 7
 */
public class JOptionPaneKalkulator {
    public static void main(String[] args) {
     String a,b;
       int nilai1;
       int nilai2;

              a= JOptionPane.showInputDialog("Masukan Nlai  A = ");
              b= JOptionPane.showInputDialog("Masukan Nilai B = ");
             
              nilai1 = Integer.parseInt(a);
              nilai2 = Integer.parseInt(b);
             
              int tambah = nilai1 + nilai2;
              int kurang = nilai1 - nilai2;
              int kali = nilai1 * nilai2;
              int bagi = nilai1 / nilai2;
             
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " + " +nilai2+ " Adalah " +tambah);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " - " +nilai2+ " Adalah " +kurang);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " * " +nilai2+ " Adalah " +kali);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " / " +nilai2+ " Adalah " +bagi);    
    }

    private static String showInputDialog(String masukan_Nlai__A__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}