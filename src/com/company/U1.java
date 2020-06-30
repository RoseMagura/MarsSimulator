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
            explosionChance = (double)(5 * ((double)currentWeight/maxWeight));
//            System.out.println(explosionChance);
            int random = (int) (Math.random() * 100) + 1;
            return random > explosionChance;
            }
    public boolean land() {
        //odds of exploding during landing
        crashChance = ((double)currentWeight/maxWeight); //1% base chance
//        System.out.println(crashChance);
        int random2 = (int) (Math.random() * 100) + 1;
        return random2 > crashChance;
    }

    public String toString(){
        return "U1 Weight: " + this.currentWeight;
    }
}
