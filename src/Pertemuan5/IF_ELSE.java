/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class IF_ELSE {
    public static void main(String[] args) {
        
        String nama,ruang = "";
        int nomor = 0 ;
        int nilai = 75 ;
        

        Scanner InputUser = new Scanner(System.in);
        
        System.out.println("     #   INPUT NILAI SISWA    #   ");
        
        System.out.println("Nama Peserta UAS ?");
        nama = InputUser.nextLine();
        
        System.out.println("Nomor Peserta UAS ?");
        nomor = Integer.parseInt(InputUser.nextLine());
        
        System.out.println("Ruangan Peserta UAS ? (A - F)");
        ruang = InputUser.nextLine();
        
        System.out.println("Nilai Akhir ?");
        nilai = Integer.parseInt(InputUser.nextLine());
        
        
        System.out.println("========================================");
        System.out.println("          NILAI PESERTA          ");
        System.out.println("Nama Peserta    : " + nama);
        System.out.println("Nomor Peserta   : " + nomor);
        System.out.println("Ruangan Peserta : " + ruang);
        System.out.println("Nilai Akhir UAS : " + nilai);
        System.out.println("---------------------------");
        System.out.println("Dengan Nilai tersebut Siswa Dinyatakan :");
        if (nilai>74){
            System.out.println("TELAH LULUS");
        }
        
        else {
            System.out.println("REMIDI/MENGULANG");
    }
        System.out.println("========================================");
        
        
    }
}

