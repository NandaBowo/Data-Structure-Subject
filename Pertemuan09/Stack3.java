/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan09;

import java.util.Stack;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Stack3 {
    public static void main(String[] args) {
        Integer[] intArr = {1001, 1002, 1003, 1004};
        Stack st = new Stack();
        for (Integer i : intArr) {
            st.push(i);
        }
        System.out.println("Nilai isi stack : " + st);
    }
}
