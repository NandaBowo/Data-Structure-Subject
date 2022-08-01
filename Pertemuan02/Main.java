/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan02;

/**
 *
 * 
 * @author Nanda D. Cahyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Soal 1");
        System.out.println(kelinciPaman(true, true));
        System.out.println(kelinciPaman(false, false));
        System.out.println(kelinciPaman(false, true));
        
        System.out.println("");
        
        System.out.println("Soal 2");
        System.out.println(notString("karyawan"));
        System.out.println(notString("pembalap"));
        System.out.println(notString("Bukan coklat"));
        
        System.out.println("");
        
        System.out.println("Soal 3");
        System.out.println(tiduran(true, false));
        System.out.println(tiduran(false, true));
    }
    
    public static boolean kelinciPaman(boolean mTidur, boolean tTidur) {
        boolean paman;
        
        if (paman = !mTidur && !tTidur) {
            return paman;
        } else if (paman = mTidur && tTidur) {
            return paman;
        }
        
        return paman;
    }
    
    public static String notString(String str) {
        String[] cek_str = str.split(" ");
        
        if (cek_str[0].equals("Bukan") || cek_str[0].equals("bukan")) {
            return str;
        } else {
            return "Bukan " + str;
        }
    }
    
    public static boolean tiduran(boolean weekday, boolean libur) {
        if (weekday == true) {
            return false;
        } else if (libur == true) {
            return true;
        }
        
        return false;
    }
}
