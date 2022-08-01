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
public class SelectionSort {
    public static void main(String[] args) {
        String[] array = {"Ika", "Adi", "Din", "Aku", "Ima", "Lia"};
        
        System.out.println("Selection Sort");
        System.out.println();
        System.out.println("Data nama: ");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        
        System.out.println();
        System.out.println();
        
        selection(array);
        
        System.out.println("Nama yang sudah di urutkan: ");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        
        System.out.println();
    }
    
    public static void selection(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[index]) < 0) {
                    index = j;
                }
            }
            
            String smallNum = array[index];
            array[index] = array[i];
            array[i] = smallNum;
        }
    }
}
