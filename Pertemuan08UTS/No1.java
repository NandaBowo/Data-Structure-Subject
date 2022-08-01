/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan08UTS;

import java.util.Scanner;

/**
 *
 * @author Nanda D. Cahyo
 */
public class No1 {
    public static void main(String[] args) {
        buku();
    }
    
    public static void buku() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jenis Buku : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan Jumlah Halaman : ");
        int halaman = input.nextInt();
        System.out.print("Masukkan Jumlah Pembaca : ");
        int pembaca = input.nextInt();
        
        System.out.println("==============================");
        
        System.out.println("Jenis buku = " + jenis);
        System.out.println("Jumlah halaman buku = " + halaman);
        System.out.println("Jumlah pembaca = " + pembaca);
    }
}
