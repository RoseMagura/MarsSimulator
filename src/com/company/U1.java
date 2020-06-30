package com.company;

public class U1 extends Rocket {
    public double explosionChance;
    public double crashChance;
    public U1(){
        cost = 100; //in millions of US dollars
        maxWeight = 18; //in tons
        currentWeight = 10;}
        public boolean launch(){
            //odds of exploding during launch
            explosionChance = (double)(0.05 * ((double)currentWeight/maxWeight));
//            System.out.println(explosionChance);
            int random = (int) (Math.random() * 100) + 1;
            return random > explosionChance;
            }
    public boolean land() {
        //odds of exploding during landing
        crashChance = 0.01 * ((double)currentWeight/maxWeight);
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }

    public String toString(){
        return "U1 Weight: " + this.currentWeight + " Explosion Chance: " + this.explosionChance;
    }
}
