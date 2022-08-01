/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan12;

/**
 *
 * @author Nanda D. Cahyo
 */
class MyNode {
    char data;
    MyNode kiri, kanan;
    
    public MyNode(char d) {
        data = d;
        kiri = kanan = null;
    }
}

public class Tugas11_1 {
    MyNode root;
    
    Tugas11_1() {
        root = null;
    }
    
    void preOrder(MyNode node) {
        if (node == null) {
            return;
        }
        
        System.out.print(node.data + " ");
        preOrder(node.kiri);
        preOrder(node.kanan);
    }
    
    void inOrder(MyNode node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.kiri);
        System.out.print(node.data + " ");
        inOrder(node.kanan);
    }
    
    void postOrder(MyNode node) {
        if (node == null) {
            return;
        }
        
        postOrder(node.kiri);
        postOrder(node.kanan);
        System.out.print(node.data + " ");
    }
    
    public static void main(String[] args) {
        Tugas11_1 t = new Tugas11_1();
        
        t.root = new MyNode('X');
        t.root.kiri = new MyNode('B');
        t.root.kiri.kanan = new MyNode('R');
        t.root.kiri.kanan.kanan = new MyNode('M');
        t.root.kiri.kiri = new MyNode('C');
        t.root.kiri.kiri.kanan = new MyNode('I');
        t.root.kiri.kanan.kiri = new MyNode('K');
        t.root.kiri.kanan.kiri.kanan = new MyNode('A');
        t.root.kiri.kanan.kiri.kanan.kanan = new MyNode('L');
        t.root.kiri.kanan.kanan.kiri = new MyNode('P');
        t.root.kiri.kanan.kanan.kiri.kanan = new MyNode('T');
        t.root.kiri.kiri.kanan.kiri = new MyNode('O');
        t.root.kiri.kiri.kanan.kiri.kanan = new MyNode('V');
        t.root.kiri.kanan.kiri.kanan.kiri = new MyNode('E');
        t.root.kiri.kanan.kiri.kanan.kiri.kanan = new MyNode('N');
        t.root.kiri.kanan.kanan.kiri.kiri = new MyNode('B');
        t.root.kiri.kanan.kanan.kiri.kiri.kanan = new MyNode('M');
        t.root.kiri.kanan.kanan.kiri.kiri.kanan.kanan = new MyNode('W');
        
        System.out.println("Pre Order");
        t.preOrder(t.root);
        System.out.println("");
        System.out.println("");
        
        System.out.println("In Order");
        t.inOrder(t.root);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Post Order");
        t.postOrder(t.root);
        System.out.println("");
    }
}
