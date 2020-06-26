package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //code here
        Simulation s1 = new Simulation();
        File file = new File("phase-1.txt");

        ArrayList items = s1.loadItems(file);
        for(Object item: items){
            System.out.println(item);
        }
//        System.out.println(Arrays.deepToString(items.toArray()));
//        System.out.println(items.get(0).toString());
    }
}
