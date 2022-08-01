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
public class No2 {
    public static void main(String[] args) {
        int nilai = 80;
        
        if (nilai < 50) {
            System.out.println("E");
        } else if (nilai >= 50 && nilai < 60) {
            System.out.println("D");
        } else if (nilai >= 60 && nilai < 75) {
            System.out.println("C");
        } else if (nilai >= 75 && nilai < 85) {
            System.out.println("B");
        } else if (nilai >= 85) {
            System.out.println("A");
        }
    }
}
