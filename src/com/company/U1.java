package com.company;

public class U1 extends Rocket {
    int cost = 100000000; //in US dollars
    public double explosionChance;

    //    double explosionChance;
//    double crashChance;
    public U1(){
        maxWeight = 18; //in tons
        currentWeight = 10;}
        public boolean launch(){
            //odds of exploding during launch
            explosionChance = (double)(0.05 * ((double)currentWeight/maxWeight));
            System.out.println(explosionChance);
            int random = (int) (Math.random() * 100) + 1;
            return random > explosionChance;
            }
    public boolean land() {
        //odds of exploding during landing
        double crashChance = 0.01 * ((double)currentWeight/maxWeight);
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }

    public String toString(){
        return "U1 Weight: " + this.currentWeight + " Explosion Chance: " + this.explosionChance;
    }
}
