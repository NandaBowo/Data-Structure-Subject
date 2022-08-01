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
class Node {
    int data;
    Node kiri, kanan;
    
    public Node(int d) {
        data = d;
        kiri = kanan = null;
    }
}

public class CobaBinaryTree {
    Node root;
    
    CobaBinaryTree() {
        root = null;
    }
    
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        
        System.out.println(node.data);
        preOrder(node.kiri);
        preOrder(node.kanan);
    }
    
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.kiri);
        System.out.println(node.data);
        inOrder(node.kanan);
    }
    
    void postOrder(Node node) {
        if (node == null) {
            return;
        }
        
        postOrder(node.kiri);
        postOrder(node.kanan);
        System.out.println(node.data);
    }
    
    public static void main(String[] args) {
        CobaBinaryTree tree = new CobaBinaryTree();
        
        tree.root = new Node(30);
        tree.root.kiri = new Node(3);
        tree.root.kanan = new Node(10);
        tree.root.kanan.kiri = new Node(5);
        tree.root.kanan.kanan = new Node(2);
        
        System.out.println("Pre Order");
        tree.preOrder(tree.root);
        System.out.println("");
        
        System.out.println("In Order");
        tree.inOrder(tree.root);
        System.out.println("");
        
        System.out.println("Post Order");
        tree.postOrder(tree.root);
        System.out.println("");
    }
}
