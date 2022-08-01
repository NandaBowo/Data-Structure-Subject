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
class NodeChar {
    char data;
    NodeChar kiri, kanan;
    
    public NodeChar(char d) {
        data = d;
        kiri = null;
        kanan = null;
    }
}

public class Tugas11_2 {
    NodeChar root;
    
    Tugas11_2() {
        root = null;
    }
    
    void preOrder(NodeChar node) {
        if (node == null) {
            return;
        }
        
        System.out.println(node.data);
        preOrder(node.kiri);
        preOrder(node.kanan);
    }
    
    void inOrder(NodeChar node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.kiri);
        System.out.println(node.data);
        inOrder(node.kanan);
    }
    
    void postOrder(NodeChar node) {
        if (node == null) {
            return;
        }
        
        postOrder(node.kiri);
        postOrder(node.kanan);
        System.out.println(node.data);
    }
    
    public static void main(String[] args) {
        Tugas11_2 tree = new Tugas11_2();
        
        tree.root = new NodeChar('X');
        tree.root.kiri = new NodeChar('B');
        tree.root.kiri.kiri = new NodeChar('C');
        tree.root.kiri.kanan = new NodeChar('I');
        tree.root.kiri.kanan.kiri = new NodeChar('O');
        tree.root.kiri.kanan.kanan = new NodeChar('V');
        tree.root.kanan = new NodeChar('R');
        tree.root.kanan.kiri = new NodeChar('K');
        tree.root.kanan.kanan = new NodeChar('A');
        
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
