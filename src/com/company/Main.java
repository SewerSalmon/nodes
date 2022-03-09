package com.company;

import com.company.Grids.Grid;

public class Main {

    public static void main(String[] args) {
        LinkedList l;
        int[] data = {1,2,3,4,5,6};
        l= new LinkedList(data);
        l.add(10);
        l.add(18);
        l.addIndex(3,32981);
        l.size();
        l.set(3,1);
        l.Displayer(3);
    }
}