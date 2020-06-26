package com.company;

public class U1 extends Rocket {
    int cost = 100000000; //in US dollars
    int currentWeight = 10; //in tons
    int maxWeight = 18; //in tons
    //odds of exploding during launch
    double explosionChance = 0.05 * (double)(currentWeight/maxWeight);
    //odds of exploding during landing
    public double crashChance = 0.01 * (double)(currentWeight/maxWeight);
    public boolean launch(){
        int random = (int) (Math.random() * 100) + 1;
        return random > explosionChance;
    }
    public boolean land() {
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }
}
