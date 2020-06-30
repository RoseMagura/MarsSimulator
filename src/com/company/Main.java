package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Simulation s1 = new Simulation();
        //U1 Phase 1
        File file1 = new File("phase-1.txt");
//        s1.U1runPhase(file1);
        //U1 Phase 2
        File file2 = new File("phase-2.txt");
//        s1.U1runPhase(file2);
        //U2 Phase 1
//        s1.U2runPhase(file1);
        //U2 Phase 2
        s1.U2runPhase(file2);
    }}
