package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Simulation s1 = new Simulation();
        File file1 = new File("phase-1.txt");
        File file2 = new File("phase-2.txt");

        System.out.println("U1 Total Budget: ");
        int U1totalBudget = s1.runSimulation(s1.loadU1(file1)) + s1.runSimulation(s1.loadU1(file2));
        System.out.println(U1totalBudget);

        System.out.println("U2 Total Budget: ");
        int U2totalBudget = s1.runSimulation(s1.loadU2(file1)) + s1.runSimulation(s1.loadU2(file2));
        System.out.println(U2totalBudget);
    }}
