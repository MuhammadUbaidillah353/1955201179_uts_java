/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class JOptionPanel {
    public static void main(String[] args) {
        
        String nama = JOptionPane.showInputDialog("Siapa Nama Anda ?");
        String ttl = JOptionPane.showInputDialog("Tanggal lahir Anda ?");
        String alamat = JOptionPane.showInputDialog("Dimana Alamat Rumah Anda ?");
        String kerja = JOptionPane.showInputDialog("Apa Pekerjaan Anda ?");
        String nomor = JOptionPane.showInputDialog("Nomor Telepon Anda ?");
        String barang = JOptionPane.showInputDialog("Barang Yang anda beli ?");
        String jumlah = JOptionPane.showInputDialog("Jumlah Barang yang Dibeli");
        
         int Jumlah = Integer.parseInt(jumlah);
         int harga  = 40000;
         double total = Jumlah*harga;
        
        System.out.println("========================================");
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Tanggal lahir Anda Adalah : " + ttl);
        System.out.println("Alamat Anda di " + alamat);
        System.out.println("Pekerjaan Anda adalah " + kerja);
        System.out.println("No.Telepon Anda Adalah : " + nomor);
        System.out.println("Barang Yang di beli adalah : " + barang);
        System.out.println("Total Harga : " + total);
        System.out.println("=========================================");
        System.out.println("Terima Kasih ^_^");
        
        
    }
}
