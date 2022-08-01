/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan09;

import java.util.Arrays;

/**
 *
 * @author Nanda D. Cahyo
 */
public class TwoStacks1 {
    int size, top1, top2, arr[];
    
    TwoStacks1(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }
    
    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    
    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    
    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    
    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    
    void display() {
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        TwoStacks1 ts = new TwoStacks1(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(25);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Pop elemen dari" + " stack1 -> " + ts.pop1());
        ts.push2(40);
        System.out.println("Pop elemen dari" + " stack2 -> " + ts.pop2());
        ts.display();
    }
}
