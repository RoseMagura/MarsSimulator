package com.company;

public class U2 extends Rocket {
    public double explosionChance;
    public double crashChance;
    public U2(){
        cost = 120;
        currentWeight = 18; //in tons
        maxWeight = 29; //in tons
}
    public boolean launch(){
        //odds of exploding during launch
        explosionChance = 4 * ((double)currentWeight/maxWeight);
        int random = (int) (Math.random() * 100) + 1;
        //for debugging:
//        System.out.println("Explosion chance: " + explosionChance);
        return random > explosionChance;
    }
    public boolean land() {
        //odds of exploding during landing
        crashChance = 8 * ((double)currentWeight/maxWeight);
        //for debugging:
        System.out.println("Crash chance: " + crashChance);
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }
    public String toString(){
        return "U2 Weight: " + this.currentWeight;
    }
}
