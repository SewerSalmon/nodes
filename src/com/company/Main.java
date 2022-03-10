package com.company;

import com.company.Grids.Grid;

public class Main {

    public static void main(String[] args) {
        LinkedList l;
        int[] data = {1,2,3,4,5,6};
        l= new LinkedList(data);
        l.set(3,1021);
        l.Displayer(2);
        l.Displayer(3);
        l.Displayer(4);
        System.out.println(l.remove());
        l.Displayer(1);
        l.Displayer(2);
        l.Displayer(3);

    }
}