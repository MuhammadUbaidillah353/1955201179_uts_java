/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class Scanner0 {
    public static void main(String[] args) {
        
        String nama,alamat,barang = "";
        int pos = 0;
        double harga = 0;
        
        
        Scanner InputUser = new Scanner(System.in);
        
        System.out.println("INPUT PEMESANAN BARANG");
        
        System.out.println("Nama Konsumen ?");
        nama = InputUser.nextLine();
        
        System.out.println("Alamat Pengiriman ?");
        alamat = InputUser.nextLine();
        
        System.out.println("Kode pos ?");
        pos = Integer.parseInt(InputUser.nextLine());
        
        System.out.println("Barang yang di beli ?");
        barang = InputUser.nextLine();
        
        System.out.println("Harga yang harus di bayar ?");
        harga = InputUser.nextDouble();
        
        System.out.println("========================================");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("TANDA PESANAN");
        System.out.println("Nama Konsumen      : " + nama);
        System.out.println("Alamat Pengiriman  : " + alamat);
        System.out.println("Kode pos           : " + pos);
        System.out.println("Barang yang dibeli : " + barang);
        System.out.println("Total Harga Barang : " + harga + " Rupiah");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        
    }
}

