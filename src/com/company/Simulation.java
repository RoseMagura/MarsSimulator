package com.company;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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

    public ArrayList loadU1(File file){ //Take item list as a parameter?
        ArrayList<Item> items = loadItems(file);
        ArrayList<U1> U1List = new ArrayList<U1>();
        U1 ship = new U1();
        U1List.add(ship);
        for(Item i: items){
            int combo = ship.currentWeight + i.weight;
            if (ship.canCarry(i)) {
                ship.carry(i);
            } else{
                U1List.add(ship);
                ship = new U1(); //Reset for new ship
                ship.carry(i);
            }
        }
//        for (U1 u1 : U1List) {
//            System.out.println(u1.toString());
//        }
        return U1List;
    }
    public ArrayList loadU2(File file){ //Add parameter for rocket type?
        ArrayList<Item> items = loadItems(file);
        ArrayList<U2> U2List = new ArrayList<U2>();
        U2 ship = new U2();
        U2List.add(ship);
        for(Item i: items){
            int combo = ship.currentWeight + i.weight;
            if (ship.canCarry(i)) {
                ship.carry(i);
            } else{
                U2List.add(ship);
                ship = new U2(); //Reset for new ship
                ship.carry(i);
            }
        }
//        for (U2 U2 : U2List) {
//            System.out.println(U2.toString());
//        }
        return U2List;
    }

    public int runSimulation(ArrayList<Rocket> list){
        int budget = 0;
        int crashCount = 0;
        for(Rocket rocket : list){
            rocket.launch();
            while(!rocket.launch()){
                crashCount++;
                rocket.launch();
                budget += rocket.cost;
            }
            budget += rocket.cost;
            rocket.land();
            while(!rocket.land()){
                crashCount++;
                rocket.land();
                budget += rocket.cost;
            }
        }
        return budget;
    }
}

