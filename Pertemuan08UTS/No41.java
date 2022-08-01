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
public class No41 {
    public static void main(String[] args) {
        String[] array = {"ccc", "zzz", "kkk", "jjj", "mmm", "ooo", "ddd", "aaa", "iii", "uuu", "eee", "ggg", "ttt", "qqq", "sss"};
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        System.out.println("Bubble Sort");
        
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
    }
}
