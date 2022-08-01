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
public class Kuis4 {
    public static void main(String[] args) {
        String[] array = {"ccc","zzz","kkk","lll","mmm","ooo","ddd","aaa","iii","uuu","eee","ggg", "ttt", "qqq", "sss", "vvv"};
        String key = "mmm";
        int result = 0;
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        for (int i = 0; i < array.length; i++) {
            if (key.equals(array[i])) {
                result = 1;
                index = i;
            }
        }
        
        if (result == 1) {
            System.out.println("Data ditemukan!");
            System.out.println("Pada index ke " + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
