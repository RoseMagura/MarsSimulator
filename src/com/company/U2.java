package com.company;

public class U2 extends Rocket {
    int cost = 120000000; //in US dollars

    public U2() {
    currentWeight = 18; //in tons
    maxWeight = 29; //in tons
}
    public boolean launch(){
        //odds of exploding during launch
        double explosionChance = 0.04 * (double)(currentWeight/maxWeight);
        int random = (int) (Math.random() * 100) + 1;
        return random > explosionChance;
    }
    public boolean land() {
        //odds of exploding during landing
        double crashChance = 0.08 * (double)(currentWeight/maxWeight);
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }
    public String toString(){
        return "U2 Weight: " + this.currentWeight;
    }
}
