/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan04;

/**
 *
 * @author Park Yuliana Styles_3130021006
 */
public class Array {
    public static void main(String[] args) {
        satuDimensi();
        System.out.println("");
        duaDimensi();
        System.out.println("");
        tigaDimensi();
    }
    
    public static void satuDimensi() {
        int[] ArraySatuDimensi = {2,4,6,8,10,12};
        
        System.out.println("Array 1D");
        for(int i = 0; i < ArraySatuDimensi.length; i++) {
            System.out.print(ArraySatuDimensi[i]+",");
        }
        System.out.println("");
    }
    
    public static void duaDimensi() {
        int[][] ArrayDuaDimensi = {{1,3,5,7,9,11},{13,15,17,19,21}};
        
        System.out.println("Array 2D");
        for(int i = 0; i < ArrayDuaDimensi.length; i++) {
            for(int j = 0; j < ArrayDuaDimensi[i].length; j++) {
                System.out.print(ArrayDuaDimensi[i][j]+",");
            }
        }
        System.out.println("");
    }
    
    public static void tigaDimensi() {
        int[][][] ArrayTigaDimensi = 
        {
            {
                {12,13,15,16},
                {17,18,19,20}
            },
            {
                {13,15,17,19,21},
                {2,4,6,8,10,12}
            }
        };
        
        System.out.println("Array 3D");
        for (int i = 0; i < ArrayTigaDimensi.length; i++) {
            for (int j = 0; j < ArrayTigaDimensi[i].length; j++) {
                for (int k = 0; k < ArrayTigaDimensi[i][j].length; k++) {
                    System.out.print(ArrayTigaDimensi[i][j][k]+",");
                }
            }
        }
        System.out.println("");
        
    }

}
