package com.company;

public class U2 extends Rocket {
    int cost = 120000000; //in US dollars
    int weight = 18; //in tons
    int maxWeight = 29; //in tons
    //odds of exploding during launch
    public double explosionChance = 0.04 * (double)(weight/maxWeight);
    //odds of exploding during landing
    public double crashChance = 0.08 * (double)(weight/maxWeight);
    public boolean launch(){
        int random = (int) (Math.random() * 100) + 1;
        return random > explosionChance;
    }
    public boolean land() {
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }
}
