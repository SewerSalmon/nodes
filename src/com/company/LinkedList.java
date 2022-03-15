package com.company;

import com.sun.source.tree.BreakTree;

public class LinkedList {
    public Node head;
    public Node cursor = null;
    public LinkedList(){
        head = null;
    }
    public LinkedList(int[] values){
        head = new Node(values[0]);
        resetNext();
        for (int x = 1;x<values.length;x++){
          cursor.setNext(new Node(values[x]));
          cursor = cursor.getNext();
        }
    }

    public void addItem(int v){
        Node n = new Node(v);
        if(head == null){
            head = n;
        }else {
            Node current = head;
            Node prev = null;
            while (current != null) {
                prev = current;
                current = current.getNext();
            }
            prev.setNext(n);
        }
    }

    public int size(){
       int count=0;
       resetNext();

       while (HasNext()){
           count++;
           cursor = getNext();
       }
        return count;
    }

    public void add(int i){
        resetNext();
        int size = size();
        for (int x=0;x<size;x++){
            cursor= getNext();
        }
        cursor.setNext(new Node(i));
    }

    public void addFirst(int i){
        int size = size();
        Node n[] =new Node[size];
        n[0] = head;
        for (int x=1;x<size;x++){
            n[x] = n[x-1].getNext();
        }
        head = null;
        head = new Node(i);
        resetNext();
        for (int x=0;x<size;x++){
            cursor.setNext(n[x]);
            cursor = getNext();
        }
    }

    public void addIndex(int index,int i){
        int size = size();
        if(index-1>size){
            System.out.println("not that many nodes");
            return;
        }
        Node n[] =new Node[size];
        n[0] = head;
        for (int x=1;x<size;x++){
            n[x] = n[x-1].getNext();
        }
        boolean done = false;
        resetNext();
        for (int x=0;x<size;x++){
            if(x == index-1 && !done){
                cursor.setNext(new Node(i));
                done = true;
                x = x-1;

            }else {
                cursor.setNext(n[x]);
            }
            cursor = getNext();

        }
    }

    public void set(int index,int i){
        int size = size();
        if(index-1>size){
            System.out.println("not that many nodes");
            return;
        }
        Node f[] =new Node[size];
        f[0] = head;
        for (int x=1;x<size;x++){
            f[x] = f[x-1].getNext();
        }
        resetNext();
        for (int x=0;x<size;x++){
            if(x == index-1 ){
                cursor.setNext(new Node(i));
            }else {
                cursor.setNext(f[x]);
            }
            cursor = getNext();
        }

    }

    public void clear(){
        head = null;
    }

    public boolean contains(int i){
        resetNext();
        for(int x = 0;x<size();x++){
            if(cursor.getValue() == i){
                return true;
            }
            cursor = getNext();
        }
        return false;
    }

    public Node remove(int index){
        int size = size();
        Node removed= null;
        if(index-1>size){
            System.out.println("not that many nodes");
            return null;
        }
        Node f[] =new Node[size];
        f[0] = head;
        for (int x=1;x<size;x++){
            f[x] = f[x-1].getNext();
        }
        resetNext();
        for (int x=0;x<size;x++){
            if(x == index-1 ){
              removed = getNext();
            }else {
                cursor.setNext(f[x]);
                cursor = getNext();
            }

        }
    return removed;

    }

    public Node remove(){
        int size = size()-1;
        Node removed= head;
        Node f[] =new Node[size];

        f[0] = head.getNext();
        for (int x=1;x<size;x++){
            f[x] = f[x-1].getNext();
        }
        head = f[0];
        resetNext();
        for (int x=0;x<size;x++){
            cursor.setNext(f[x]);
            cursor = getNext();
        }

        return removed;
    }

    public int indexOf(int i){
        resetNext();
        for(int x = 0;x<size();x++){
            if(cursor.getValue() == i){
                return x+1;
            }
            cursor = getNext();
        }
        return -1;
    }

    //get, get first and get last all in one
    public void Displayer(int where){
        resetNext();
        for(int x = 0; x<where-1;x++){
            if(!HasNext()){
                System.out.println("not that many nodes");
                return;
            }else {
                cursor = getNext();}
        }

        cursor.Display();
    }

    public void outputTotal(){
        int sum = 0;
        resetNext();
        for(int y = 0;y<size()+1;y++){
            sum = sum + cursor.getValue();
            cursor = cursor.getNext();
        }
        System.out.println(sum);
    }

    public void resetNext(){
        cursor = head;
    }
    public boolean HasNext(){
        return getNext() != null;
    }


    public Node getNext(){
        return cursor.getNext();
    }
    public boolean isEmpty(){
        if(cursor == null){return true;}else {return false;}
    }


}
