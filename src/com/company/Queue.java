package com.company;

public class Queue extends LinkedList{
    public Queue(){
        super();
    }

    public void enqueue(int n){
        super.addIndex(size(),n);
    }

    public int dequeue(){
       return remove(0).getValue();
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }
}
