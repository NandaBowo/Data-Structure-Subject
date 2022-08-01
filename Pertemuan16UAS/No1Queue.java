/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan16UAS;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Nanda D. Cahyo
 */
public class No1Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(54);
        queue.add(76);
        queue.add(44);
        queue.add(23);
        queue.add(34);
        
        System.out.println("Setelah enqueue : " + queue);
        
        queue.remove(54);
        queue.remove(33);
        
        System.out.println("Setelah dequeue : " + queue);
    }
}
