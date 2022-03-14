package com.company;

import com.company.Grids.Grid;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList l;
        int[] data = {1,2,3,4,5,6};
        l= new LinkedList(data);
        l.outputTotal();

        StringList sl;
        String[] Sdata = {"1","2","3","4","5","6"};
        sl= new StringList(Sdata);
        sl.outputTotal();



    }
}