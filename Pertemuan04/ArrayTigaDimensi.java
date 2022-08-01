/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan04;

/**
 *
 * @author Nanda D. Cahyo
 */
public class ArrayTigaDimensi {
    public static void main(String[] args) {
        int[] satuD = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        int[][] duaD = {
            {1, 2, 3, 4, 5, 6}, 
            {7, 8, 9, 10, 11, 12}
        };
        
        int[][][] tigaD = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
        
        /**
         * Array 1 Dimensional
         * 
         * int[] namaArray = {};
         */
        System.out.println("Looping array 1 dimensi");
        for (int i = 0; i < satuD.length; i++) {
            System.out.print(satuD[i] + ", ");
        }
        System.out.println();
        
        /**
         * Array 2 Dimensional
         * 
         * int[][] namaArray = { {}, {} };
         */
        System.out.println("Looping array 2 dimensi");
        for (int i = 0; i < duaD.length; i++) {
            for (int j = 0; j < duaD[i].length; j++) {
                System.out.print(duaD[i][j] + ", ");
            }
        }
        System.out.println();
        
        /**
         * Array 3 Dimensional
         * 
         * int[][][] namaArray = { { {}, {} }, { {}, {} } };
         */
        System.out.println("Looping array 3 dimensi");
        for (int i = 0; i < tigaD.length; i++) {
            for (int j = 0; j < tigaD[i].length; j++) {
                for (int k = 0; k < tigaD[i][j].length; k++) {
                    System.out.print(tigaD[i][j][k] + ", ");
                }
            }
        }
        System.out.println();
    }
}
