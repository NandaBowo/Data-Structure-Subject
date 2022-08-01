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
public class No43 {
    public static void main(String[] args) {
        String[][] array = {
            {"aaa", "ccc", "ddd"},
            {"eee", "ggg", "iii"},
            {"jjj", "kkk", "mmm"},
            {"ooo", "qqq", "sss"},
            {"ttt", "uuu", "zzz"},
        };
        
        String key = "kkk";
        int row = array.length;
        int col = array[0].length;
        int first = 0;
        int last = row * col - 1;
        int mid, midRow = 0, midCol = 0, result = 0;
        String midVal;
        
        System.out.println("Binary Search 2 Dimensi");
        System.out.println("");
        System.out.println("Data : ");
        
        for (String[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + " ");
                if (j == array1.length - 1) {
                    System.out.println("");
                }
            }
        }
        
        System.out.println("");
        System.out.println("Data yang dicari : " + key);
        System.out.println("");
        
        while (first <= last) {
            mid = (first + last) / 2;
            midRow = mid / col;
            midCol = mid % col;
            midVal = array[midRow][midCol];
            
            if (midVal.equals(key)) {
                result = 1;
                break;
            } else if (midVal.compareTo(key) < 0) {
                first = mid + 1;
            } else if (midVal.compareTo(key) > 0) {
                last = mid - 1;
            } else {
                result = 0;
                break;
            }
        }
        
        if (result > 0) {
            System.out.printf("Data ditemukan pada baris ke %s kolom ke %s \n"
                    , midRow + 1, midCol + 1);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
