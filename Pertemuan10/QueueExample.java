/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan10;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Nanda D. Cahyo
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("ALO");
        
        queue.offer("abc");
        queue.offer("234");
        queue.offer("5");
        
        System.out.println("Queue : " + queue);
        
        System.out.println("Removed queue : " + queue.remove() + "\nQueue : " + queue);
        
        System.out.println("Removed queue : " + queue.poll() + "\nQueue : " + queue);
        
        System.out.println("Element : " + queue.element());
        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());
    }
}
