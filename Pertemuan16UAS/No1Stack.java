/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan16UAS;

import java.util.Stack;

/**
 *
 * @author Nanda D. Cahyo
 */
public class No1Stack {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        
        stk.push("Ryu");
        stk.push("Kirana");
        stk.push("Aulia");
        stk.push("Rizqi");
        
        System.out.println("Stack : " + stk);
        
        stk.remove("Rizqi");
        stk.remove("Kirana");
        
        System.out.println("Stack : " + stk);
    }
}
