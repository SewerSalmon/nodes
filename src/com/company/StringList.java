package com.company;

import java.util.List;

public class StringList extends LinkedList {
    public StringNode head;
    public StringList(String[] data){
        head = new StringNode(data[0]);
        StringNode n = head;
        for (int x = 1;x<data.length;x++){
            n.setNext(new StringNode(data[x]));
            n = n.getNext();
        }
    }
    @Override
    public int size(){
        int count=0;
        StringNode n = head;

        while (n.getNext()!=null){
            count++;
            n = n.getNext();

        }
        return count;
    }


    @Override
    public void outputTotal(){
        String sum = "";
        StringNode n = head;
        for(int y = 0;y<size()+1;y++){
            sum = sum + n.getValue();
            n = n.getNext();
        }
        System.out.println(sum);
    }

}
