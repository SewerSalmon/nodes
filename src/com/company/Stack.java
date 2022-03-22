package com.company;

public class Stack extends LinkedList{
    public Stack(){
        super();
    }
    public void push(int n){
        addFirst(n);
    }

    public Node peek(){
        return Displayer(0);
    }

    public Node pop(){
        return remove();
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public boolean isFull(int max){
        return (size()==max);
    }
}
