/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class BuffererdReaders {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String nama,alamat,alasan,saran,status = "";
        int usia = 0;
        double berat = 0;
        
        System.out.println("# SURVEY PENGGUNA APLIKASI NetBeans #");
        
        //Objek InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);
        //Objek BufferedReader
        BufferedReader br = new BufferedReader(isr);
        //Objek Scanner
        Scanner InputUser = new Scanner(System.in);
        
        //Memasukkan Variabel Input
        System.out.println("1.Siapa Nama Anda ?");
        nama = br.readLine();
        
        System.out.println("2.Alamat Rumah Anda ?");
        alamat = br.readLine();
        
        System.out.println("3.Berapa Umur Anda ?");
        usia = Integer.parseInt(InputUser.nextLine());
        
        System.out.println("4.Berapa Berat Badan Anda ?");
        berat = Integer.parseInt(InputUser.nextLine());
        
        System.out.println("5.Apa Pekerjaan Anda ?");
        status = br.readLine();
        
        System.out.println("6.Apa Alasan Anda menggunakan Aplikasi NetBeans ?");
        alasan = br.readLine();
        
        System.out.println("7.Apa Saran anda untuk pengembangan aplikasi NetBeans ?");
        saran = br.readLine();
        
        System.out.println("TERIMA KASIH ATAS MASUKANNYA ^_^");
        
        // Menampilkan Output
        System.out.println("=========================");
        System.out.println("# HASIL SURVEY #");
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Alamat Anda di " + alamat);
        System.out.println("Usia Anda " + usia + " Tahun");
        System.out.println("Berat Badan Anda " + berat + " Kg");
        System.out.println("Status Anda Adalah " + status);
        System.out.println("Alasan Anda Menggunakan Aplikasi NetBeans Adalah : " + alasan);
        System.out.println("Saran yang anda berikan Adalah : " + "*" + saran + "*");
        System.out.println("=========================");
        
    }
    
}

