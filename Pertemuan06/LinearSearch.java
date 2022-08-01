/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan06;

/**
 *
 * @author Nanda D. Cahyo
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 34, 23, 53, 64, 12, 2};
        int key = 23;
        int result = 0;
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                result = 1;
                index = i;
            }
        }
        
        if (result == 1) {
            System.out.println("Data ditemukan");
            System.out.println("Pada index ke " + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
