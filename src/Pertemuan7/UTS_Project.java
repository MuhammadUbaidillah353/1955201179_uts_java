 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class UTS_Project {
    public static void main(String[] args) {
        
        boolean running = true;
        int counter = 0, nobu = 0, harga = 0, cash = 0, kembalian = 0;
        int buku1 = 50000 ,buku2 = 55000, buku3 = 45000, buku4 = 35000;
        String nama,alamat,email,jawab,jenis,pay,enter,enter1 = "";
        String buku = null;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("^_^ Selamat Datang di Website TOKO BUKU ONLINE ^_^");
        System.out.println("            Harap Daftar terlebih dahalu           ");
        
        System.out.print("Nama   : ");
        nama = scan.nextLine();
        
        System.out.print("Alamat : ");
        alamat = scan.nextLine();
        
        System.out.print("Email  : ");
        email = scan.nextLine();
        
        System.out.println("----------------------------------------------");
        System.out.println("#            Pendaftaran Berhasil            #");
        
        while (running) {
            System.out.print("Lanjut ke Toko ? [y/t] : ");
            jawab = scan.nextLine();
            
            if (jawab.equalsIgnoreCase("y")){
                running = false;
            }
            counter++;
        }
        
        System.out.println("|=================================================|");
        System.out.println("|                 TOKO BUKU ONLINE                |");
        System.out.println("|       ( Buku Belajar, Buku Cerita, E-Book )     |");
        System.out.println("|=================================================|");
        System.out.println("|    Daftar Buku             |       Harga        |");
        System.out.println("|1. CorelDRAW                | Rp. 50.000         |");
        System.out.println("|2. Belajar IT               | Rp. 55.000         |");
        System.out.println("|3. Cerdas Matematika        | Rp. 45.000         |");
        System.out.println("|4. Kisah Tangkuban Perahu   | Rp. 35.000         |");
        System.out.println("|=================================================|");
        
        System.out.print("Pilih jenis Buku biasa atau E-book ? ");
        jenis = scan.nextLine();
        
        System.out.print("Pilih nomor buku yang akan di beli : ");
        nobu = scan.nextInt();
        
                switch (nobu){
                case 1:
                  buku = "CorelDRAW";
                  System.out.println("Anda memilih buku nomor " + nobu + " Yaitu Buku " + buku + " jenis " + jenis);
                  harga = harga + buku1;
                 break;
                
                case 2:
                 buku = "Belajar IT";
                  System.out.println("Anda memilih buku nomor " + nobu + " Yaitu Buku " + buku + " jenis " + jenis);
                  harga = harga + buku2;
                 break;
                
                 case 3:
                 buku = "Cerdas Matematika";
                  System.out.println("Anda memilih buku nomor " + nobu + " Yaitu Buku " + buku + " jenis " + jenis);
                   harga = harga + buku3;
                  break;
                
                 case 4:
                  buku = "Kisah Tangkuban Perahu";
                  System.out.println("Anda memilih buku nomor " + nobu + " Yaitu Buku " + buku + " jenis " + jenis);
                  harga = harga + buku4;
                  break;
                  
                 default:
                    System.out.println("Nomor yang dipilih tidak ada pada daftar di atas.");
                    break;
            }
        
        System.out.println("Harga Buku : Rp." + harga);
        
        System.out.println("------------------------------------------");
        enter = scan.nextLine();
        
        System.out.println("Klik Enter untuk melanjutkan Pembayaran");
        enter1 = scan.nextLine();
        
        System.out.println("Metode Pembayaran : [Pulsa/ATM]");
        pay = scan.nextLine();
        
        System.out.println("Masukkan Nominal : Rp.");
        cash = scan.nextInt();
        
        System.out.println("-------------------------------------------");

        
        
        System.out.println("===========================================");
        System.out.println("TANDA PEMESANAN");
        System.out.println("Nama Pemesan       : " + nama);
        System.out.println("Alamat Pengiriman  : " + alamat);
        System.out.println("Email              : " + email);
        System.out.println("Buku yang dibeli   : " + buku);
        System.out.println("Jenis buku         : " + jenis);
        System.out.println("Harga Buku         : Rp." + harga);
        System.out.println("Pembayaran Via     : " + pay);
        System.out.println("===========================================");
        
        kembalian = cash - harga;
        
        System.out.println("=========================");
        System.out.println("Bayar     : " + cash);
        System.out.println("Kembalian : " + kembalian);
        System.out.println("=========================");
        
        System.out.println("   ^_^ TERIMA KASIH  ^_^  ");
        
    }  
    
}


