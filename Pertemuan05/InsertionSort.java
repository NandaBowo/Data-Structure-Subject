/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan05;

/**
 *
 * @author Nanda D. Cahyo
 */
public class InsertionSort {
    public static void main(String[] args) {
        String[] array = {"Ika", "Adi", "Din", "Aku", "Ima", "Lia"};
        
        System.out.println("Insertion Sort");
        System.out.println();
        System.out.println("Data nama: ");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        
        System.out.println();
        System.out.println();
        
        insertion(array);
        
        System.out.println("Nama yang sudah di urutkan: ");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        
        System.out.println();
    }
    
    public static void insertion(String[] array) {
        for (int j = 1; j < array.length; j++) {
            String key = array[j];
            int i = j - 1;
            
            while (i > -1 && array[i].compareTo(key) > 0) {
                array[i + 1] = array[i];
                i--;
            }
            
            array[i + 1] = key;
        }
    }
}
