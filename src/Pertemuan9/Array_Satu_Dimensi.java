/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;


import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class Array_Satu_Dimensi {
    public static void main(String[] args) {
        
        String Siswa[] = new String [6];
        for (int i = 1; i<Siswa.length; i++){
            Siswa[i] = JOptionPane.showInputDialog(null,"Masukkan Nomor Absen Siswa " + i );
            System.out.println(Siswa[i]);
            }
        
        String CariNo = JOptionPane.showInputDialog(null, "Cari Nama Siswa Berdasarkan Nomor Absen");
        
        for (int i = 1; i<Siswa.length; i++){
             if (Siswa[i].equals(CariNo)){
                 JOptionPane.showMessageDialog(null,"Nama yang anda cari adalah " + CariNo + " Dari Nomor Absen ke " + i);
             }
            }  
        
    }
}
            

