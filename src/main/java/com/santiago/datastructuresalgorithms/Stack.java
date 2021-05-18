package com.santiago.datastructuresalgorithms;
public class Stack {

    class Node{
        Object value;
        Node next;
        Node(Object value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node top;
    private int size;

    public Object peek(){
        Object value = this.top.value;
        return value;
    }

    public void push(Object element){
        Node node = new Node(element, null);
        if(this.top == null){
            this.top = node;
        }else{
            Node tail = this.top;
            this.top = node;
            this.top.next = tail;
        }
        size++;
    }

    public boolean isEmpty(){
        return this.top == null;
    }

    public int getSize() {
        return size;
    }

    public Object pop(){
        Object popped = this.top.value;
        this.top = this.top.next;
        size--;
        return popped;
    }



}
