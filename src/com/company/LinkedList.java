package com.company;

import com.sun.source.tree.BreakTree;

public class LinkedList {
    public Node head;
    public LinkedList(){
        head = null;
    }
    public LinkedList(int[] values){
        head = new Node(values[0]);
        Node n = head;
        for (int x = 1;x<values.length;x++){
          n.setNext(new Node(values[x]));
          n = n.getNext();
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
        Node n = head;

       while (n.getNext()!=null){
           count++;
          n = n.getNext();

       }
        return count;
    }

    public void add(int i){
        Node n = head;
        int size = size();
        for (int x=0;x<size;x++){
            n= n.getNext();
        }
        n.setNext(new Node(i));
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
        Node f = head;
        for (int x=0;x<size;x++){
           f.setNext(n[x]);
           f = f.getNext();
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
        Node f = head;
        for (int x=0;x<size;x++){
            if(x == index-1 && !done){
                f.setNext(new Node(i));
                done = true;
                x = x-1;

            }else {
                f.setNext(n[x]);
            }
            f = f.getNext();

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
        Node n = head;
        for (int x=0;x<size;x++){
            if(x == index-1 ){
                n.setNext(new Node(i));
            }else {
                n.setNext(f[x]);
            }
            n = n.getNext();
        }

    }

    public void clear(){
        head = null;
    }

    public boolean contains(int i){
        Node n = head;
        for(int x = 0;x<size();x++){
            if(n.getValue() == i){
                return true;
            }
            n = n.getNext();
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
        Node n = head;
        for (int x=0;x<size;x++){
            if(x == index-1 ){
              removed = n.getNext();
            }else {
              n.setNext(f[x]);
              n = n.getNext();
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
        Node n = head;
        for (int x=0;x<size;x++){
                n.setNext(f[x]);
                n = n.getNext();
        }

        return removed;
    }

    public int indexOf(int i){
        Node n = head;
        for(int x = 0;x<size();x++){
            if(n.getValue() == i){
                return x+1;
            }
            n = n.getNext();
        }
        return -1;
    }

    //get, get first and get last all in one
    public Node Displayer(int where){
        Node n = head;
        for(int x = 0; x<where-1;x++){
            if(n.getNext() == null){
                System.out.println("not that many nodes");
                return null;
            }else {
                n = n.getNext();}
        }
        n.Display();
        return n;
    }

    public void outputTotal(){
        int sum = 0;
        Node n = head;
        for(int y = 0;y<size()+1;y++){
            sum = sum + n.getValue();
            n = n.getNext();
        }
        System.out.println(sum);
    }

    public Node cursor = null;
    public void resetNext(){
        cursor = head;
    }
    public boolean HasNext(){
        if(cursor.getNext() == null){return false;}else{return true;}
    }
    public Node getNext(){
        return cursor.getNext();
    }
    public boolean isEmpty(){
        if(head == null){return true;}else {return false;}
    }


}
