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
public class TugasStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1001);
        st1.push(1002);
        st1.push(1003);
        st1.push(1004);
        System.out.print("Stack 1 : ");
        st1.forEach((a) -> {
            System.out.print(a + " ");
        });
        
        System.out.println("");
        
        Stack<Character> st2 = new Stack<>();
        st2.push('V');
        st2.push('W');
        st2.push('X');
        st2.push('Y');
        st2.push('Z');
        System.out.print("Stack 2 : ");
        st2.forEach((a) -> {
            System.out.print(a + " ");
        });
        
        System.out.println("");
        
        Stack<Double> st3 = new Stack<>();
        st3.push(5.1d);
        st3.push(5.2d);
        st3.push(5.3d);
        st3.push(5.4d);
        System.out.print("Stack 3 : ");
        st3.forEach((a) -> {
            System.out.print(a + " ");
        });
        
        System.out.println("");
        
        Stack<String> st4 = new Stack<>();
        st4.push("Saya");
        st4.push("Suka");
        st4.push("Java");
        st4.push("Banget");
        System.out.print("Stack 4 : ");
        st4.forEach((a) -> {
            System.out.print(a + " ");
        });
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Pop Stack 2 : " + st2.pop());
        System.out.println("Pop Stack 2 : " + st2.pop());
        System.out.println("Pop Stack 2 : " + st2.pop());
        System.out.println("Pop Stack 3 : " + st3.pop());
        System.out.println("Seach \"Java\" Stack 4 : " + st4.search("Java"));
        
        System.out.println("");
        
        System.out.println("Status Stack 1 : " + st1);
        System.out.println("Status Stack 2 : " + st2);
        System.out.println("Status Stack 3 : " + st3);
        System.out.println("Status Stack 4 : " + st4);
    }
}
