package com.santiago.datastructuresalgorithms;

public class Queue {
    private static class Node{
        private Object data;
        private Node next;
        private Node(Object data){
            this.data =data;
        }
    }
    private Node head;//remove things from head
    private Node tail;//add things here

    public boolean isEmpty(){
        return this.head == null;
    }

    public int peek(){
        return (int) head.data;
    }

    public void add(int data){
        Node node = new Node(data);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }

    public int remove(){
        int data = (int) head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }
}

