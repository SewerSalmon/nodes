package com.company;

import com.company.Grids.Grid;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList l;
        int[] data = {1,2,3,4,5,6};
        l= new LinkedList(data);
        l.set(3,1021);
        l.Displayer(1);
        l.Displayer(2);
        l.Displayer(3);
        System.out.println(l.remove().getValue() + " was removed");
        l.Displayer(1);
        l.Displayer(2);
        l.Displayer(3);

    }
}