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
                    item.weight = Integer.parseInt(array[i+1]);
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
    }}

