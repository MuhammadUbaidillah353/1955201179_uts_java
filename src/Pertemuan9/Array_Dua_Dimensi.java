/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

/**
 *
 * @author Muhammad Ubaidillah
 */
public class Array_Dua_Dimensi {
    public static void main(String[] args) {
        
        System.out.println("Array 1 Dimensi");
        int Angka[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        
        for (int i = 0; i<Angka.length; i++) {
        System.out.println(Angka[i]);
      }
        
        System.out.println("Array 2 Dimensi Integer");
        int Matriks[][] = {{1,4},
                           {5,7}};
        
        for (int i = 0; i < Matriks.length; i++) {
            for (int a = 0; a < Matriks[0].length; a++) {
                System.out.print(Matriks[i][a] + " ");
            }
            System.out.println(" ");
        }
       
        System.out.println("Array 2 Dimensi String");
        String Mahasiswa [][] = {{"0","Ubaidillah"},{"1","Nayla"},{"2","Adiatma"}};
        
        for (int i = 0; i<Mahasiswa.length; i++){
            for (int a = 0; a<Mahasiswa[0].length; a++){
                System.out.print(Mahasiswa[i][a] + " ");
            }
            System.out.println(" ");
        }
        
    }
}
