/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan11;

import java.util.Scanner;

/**
 *
 * @author Nanda D. Cahyo
 */
class Node {
    protected int data;
    protected Node link;
    
    public Node() {
        link = null;
        data = 0;
    }
    
    public Node(int d, Node n) {
        data = d;
        link = n;
    }
    
    public void setLink(Node n) {
        link = n;
    }
    
    public void setData(int d) {
        data = d;
    }
    
    public Node getLink() {
        return link;
    }
    
    public int getData() {
        return data;
    }
}

class LinkedList {
    protected Node start;
    protected Node end;
    public int size;
    
    public void linkedList() {
        start = null;
        end = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return start == null;
    }
    
    public int getSize() {
        return size;
    }
    
    public void insertAtStart(int val) {
        Node nptr = new Node(val, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
    }
    
    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
    }
    
    public void insertAtPos(int val, int pos) {
        Node nptr = new Node(val, null);
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }
    
    public void deleteAtPos(int pos) {
        if (pos == 1) {
            start = start.getLink();
            size--;
            return;
        }
        if (pos == size) {
            Node s = start;
            Node t = start;
            while (s != end) {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size - 1; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }
    
    public void display() {
        System.out.print("\nSingle List = ");
        if (size == 0) {
            System.out.print("Kosong\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.print(start.getData() + "->");
        ptr = start.getLink();
        while(ptr.getLink() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + "\n");
    }
}

public class ContohSingleLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Coba Single Linked List");
        char ch;
        do {
            System.out.println("\nSL PERINTAH\n");
            System.out.println("1. Masukkan Data Awal");
            System.out.println("2. Masukkan Data Akhir");
            System.out.println("3. Masukkan Posisi");
            System.out.println("4. Hapus posisi");
            System.out.println("5. Cek Kosong");
            System.out.println("6. Hitung Size");
            System.out.print("\nInputan anda : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 :
                    System.out.print("\nMasukkan nilai elemen : ");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2 :
                    System.out.print("\nMasukkan nilai elemen : ");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3 :
                    System.out.print("\nMasukkan nilai elemen : ");
                    int num = scan.nextInt();
                    System.out.print("Masukkan posisi : ");
                    int pos = scan.nextInt();
                    if (pos <= 1 || pos > list.getSize()) {
                        System.out.println("Posisi tidak valid \n");
                    } else {
                        list.insertAtPos(num, pos);
                    }
                    break;
                case 4 :
                    System.out.print("\nMasukkan posisi : ");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize()) {
                        System.out.println("Posisi tidak valid \n");
                    } else {
                        list.deleteAtPos(p);
                    }
                    break;
                case 5 :
                    System.out.println("\nCEK KOSONG = " + list.isEmpty());
                    break;
                case 6 :
                    System.out.println("\nSize = " + list.getSize());
                    break;
                default :
                    System.out.println("SALAH! Masukkan inputan yang benar \n");
                    break;
            }
            list.display();
            System.out.print("\nMau lanjut? (y/n) : ");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
