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
public class Program3 {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Stack : " + st);
        System.out.println("");
        showPush(st, 100);
        showPush(st, 200);
        showPush(st, 300);
        showPush(st, 400);
        showPush(st, 500);
        showPop(st);
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
    
    private static void showPush(Stack st, int a) {
        st.push(a);
        System.out.println("Push -> (" + a + ")");
        System.out.println("Stack : " + st);
        System.out.println("");
    }
    
    private static void showPop(Stack st) {
        System.out.print("Pop -> ");
        Integer a = (Integer) st.pop();
        System.out.print("(");
        System.out.print(a);
        System.out.println(")");
        System.out.println("Stack : " + st);
        System.out.println("");
    }
}
