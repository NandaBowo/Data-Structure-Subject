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
public class Kuis5 {
    public static void main(String[] args) {
        String[][] array = {
            {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF"}, 
            {"GGG", "HHH", "III", "JJJ", "KKK", "LLL"},
            {"MMM", "NNN", "OOO", "PPP", "QQQ", "RRR"},
            {"SSS", "TTT", "UUU", "VVV", "WWW", "XXX", "YYY", "ZZZ"},
        };
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
    }
}
