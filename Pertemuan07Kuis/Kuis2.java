/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan07Kuis;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Kuis2 {
    public static void main(String[] args) {
        int nilai = 7;
        
        int nilai_fibonacci = fibonacci(nilai);
        System.out.println("Nilai fibonacci ke-" + nilai + " adalah = " + nilai_fibonacci);
    }
    
    private static int fibonacci(int n) {
        if (n == 1) {
            return n;
        } else if (n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
