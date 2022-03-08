package com.company;

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

    public void Displayer(int where){
        Node n = head;
        for(int x = 0; x<where-1;x++){
            if(n.getNext() == null){
                System.out.println("not that many nodes");
                return;
            }else {
                n = n.getNext();}
        }

        n.Display();
    }

}
