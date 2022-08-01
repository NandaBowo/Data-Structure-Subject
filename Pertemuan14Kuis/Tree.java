/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan14Kuis;

/**
 *
 * @author Nanda D. Cahyo
 */

class Node {
    int data;
    Node kiri, kanan;
    
    public Node(int d) {
        data = d;
        kiri = kanan = null;
    }
}

public class Tree {
    Node root;
    
    Tree() {
        root = null;
    }
    
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        
        System.out.print(node.data + " ");
        preOrder(node.kiri);
        preOrder(node.kanan);
    }
    
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.kiri);
        System.out.print(node.data + " ");
        inOrder(node.kanan);
    }
    
    void postOrder(Node node) {
        if (node == null) {
            return;
        }
        
        postOrder(node.kiri);
        postOrder(node.kanan);
        System.out.print(node.data + " ");
    }
    
    public static void main(String[] args) {
        Tree t = new Tree();
        
        t.root = new Node(102);
        t.root.kiri = new Node(17);
        t.root.kanan = new Node(6);
        t.root.kanan.kiri = new Node(2);
        t.root.kanan.kanan = new Node(3);
        
        System.out.println("Pre Order");
        t.preOrder(t.root);
        System.out.println("");
        
        System.out.println("In Order");
        t.inOrder(t.root);
        System.out.println("");
        
        System.out.println("Post Order");
        t.postOrder(t.root);
        System.out.println("");
    }
}
