/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan03;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Recursive {
    public static void main(String[] args) {
        System.out.println(recursive(10));
    }
    
    public static int recursive(int num) {
        if (num == 0) {
            return 0;
        } else {
            System.out.print(num);
            if (num == 1) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
            return num + recursive(num - 1);
        }
    }
}
