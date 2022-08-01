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
public class No42 {
    public static void main(String[] args) {
        int[] array = {9, 18, 27, 28, 30, 45, 50, 54, 58, 61, 63, 77, 89};
        int key = 0;
        
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            int i = j - 1;
            
            while (i > -1 && array[i]> key) {
                array[i + 1] = array[i];
                i--;
            }
            
            array[i + 1] = key;
        }
        
        System.out.println("Insertion Sort");
        
        for (int array1 : array) {
            System.out.print(array1 + " ");
        }
        
        System.out.println("");
    }
}
