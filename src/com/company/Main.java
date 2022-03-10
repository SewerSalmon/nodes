package com.company;

import com.company.Grids.Grid;

public class Main {

    public static void main(String[] args) {
        LinkedList l;
        int[] data = {1,2,3,4,5,6};
        l= new LinkedList(data);
        System.out.println(l.size());
        l.add(10);
        System.out.println(l.size());
        l.add(18);
        System.out.println(l.size());
        l.addIndex(3,32981);
        l.Displayer(3);
        l.set(3,1021);
        l.Displayer(3);

    }
}