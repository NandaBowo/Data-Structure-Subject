/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan09;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Stack1 {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Stack : " + st);
        showPush(st, 11);
        showPush(st, 22);
        showPush(st, 33);
        showPush(st, 44);
        showPop(st);
        showPop(st);
        showPop(st);
        showPop(st);
        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("Stack sudah kosong");
        }
    }
    
    static void showPush(Stack st, int a) {
        st.push(a);
        System.out.println("Lakukan push -> (" + a + ")");
        System.out.println("Nilai stack : " + st);
    }
    
    static void showPop(Stack st) {
        System.out.print("Lakukan pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack : " + st);
    }
}
