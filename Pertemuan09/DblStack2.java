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
public class DblStack2 {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<Integer>();
        st1.push(100);
        st1.push(200);
        System.out.print("Stack 1 : ");
        for (int a : st1) {
            System.out.print(a + " ");
        }
        
        Stack<String> st2 = new Stack<String>();
        st2.push("Saya");
        st2.push("Nanda");
        System.out.print("\nStack 2 : ");
        for (String a : st2) {
            System.out.print(a + " ");
        }
    }
}
