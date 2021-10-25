package com.thienhnm2008110318.kiemtragiuaky;

public class node {

    Node head;

    class Node {
        int data;
        Node next;
  
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    public void insertfront(int data)
    {
        Node new_node = new Node(data);
        
        new_node.next = head;
        
        head = new_node;
    }
    
}
