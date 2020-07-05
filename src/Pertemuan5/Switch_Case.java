/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class Switch_Case {
    public static void main(String[] args) throws IOException {
        
        String bulan,zodiak = "";
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Bulan Lahir ? (ketik berupa angka)");
        bulan = br.readLine();
        
        switch (bulan){
            case "1":
                zodiak = "Capricorn";
                break;
            case "2":
                zodiak = "Aquarius";
                break;
            case "3":
                zodiak = "Pisces";
                break;
            case "4":
                zodiak = "Aries";
                break;
            case "5":
                zodiak = "Taurus";
                break;
            case "6":
                zodiak = "Gemini";
                break;
            case "7":
                zodiak = "Cancer";
                break;
            case "8":
                zodiak = "Leo";
                break;
            case "9":
                zodiak = "Virgo";
                break;
            case "10":
                zodiak = "Libra";
                break;
            case "11":
               zodiak = "Scorpio";
                break;
            case "12":
                zodiak = "Sagitarius";
                break;
            default:  System.out.println("Key yang anda masukkan salah");
    }
        System.out.println("Zodiak Anda : " + zodiak);
    }
}
