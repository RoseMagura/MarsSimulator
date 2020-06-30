package com.company;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.io.File;


public class Simulation {
    public ArrayList loadItems(File file){
    ArrayList<Item> list = new ArrayList<Item>();
    Scanner scanner;
    {
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (int i=0; i<1; i++) {
                    Item item = new Item();
                    String[] array = line.split("=");
                    item.name = array[i];
                    int weight = Integer.parseInt(array[i+1]);
                    item.weight = weight/1000;
                    list.add(item);
                }
            }
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Sorry, could not find file");
        }
    }
        return list;
    }

    public ArrayList U1runPhase(File file){ //Add parameter for rocket type?
        ArrayList<Item> items = loadItems(file);
        ArrayList<U1> U1List = new ArrayList<U1>();
        U1 ship = new U1();
        U1List.add(ship);
        for(Item i: items){
            int combo = ship.currentWeight + i.weight;
            if (combo <= ship.maxWeight) {
                ship.carry(i);
            } else{
                U1List.add(ship);
                ship = new U1(); //Reset for new ship
                ship.carry(i);
            }
        }
        System.out.println((U1List.size()));
        for (U1 u1 : U1List) {
            System.out.println(u1.toString());
        }
        return U1List;
    }
    public ArrayList U2runPhase(File file){ //Add parameter for rocket type?
        ArrayList<Item> items = loadItems(file);
        ArrayList<U2> U2List = new ArrayList<U2>();
        U2 ship = new U2();
        U2List.add(ship);
        for(Item i: items){
            int combo = ship.currentWeight + i.weight;
            if (combo <= ship.maxWeight) {
                ship.carry(i);
            } else{
                U2List.add(ship);
                ship = new U2(); //Reset for new ship
                ship.carry(i);
            }
        }
        System.out.println((U2List.size()));
        for (U2 U2 : U2List) {
            System.out.println(U2.toString());
        }
        return U2List;
    }
}

