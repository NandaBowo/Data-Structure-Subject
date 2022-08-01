/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan06;

import java.util.Arrays;

/**
 *
 * @author Nanda D. Cahyo
 */
public class BinarySearch1D {
    public static void main(String[] args) {
        int[] array = {1, 34, 23, 53, 51, 54, 90, 2, 17, 13};
        int first = 0;
        int last = array.length - 1;
        int mid = (last + first) / 2;
        int key = 13;
        
        System.out.println("Binary Search 1 Dimensi");
        System.out.println("");
        
        Arrays.sort(array);
        
        System.out.print("Data : ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Data yang dicari : " + key);
        
        for (; first <= last;) {
            if (key == array[mid]) {
                System.out.println("Data ditemukan pada index ke " + mid);
                break;
            } else if (key < array[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
            
            mid = (last + first) / 2;
        }
        
        if (first > last) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
