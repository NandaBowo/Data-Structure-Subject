/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan08UTS;

/**
 *
 * @author Nanda D. Cahyo
 */
public class No3 {
    public static void main(String[] args) {
        int nilai = 13;
        
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
