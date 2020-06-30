package com.company;

public class Rocket implements SpaceShip {
    public int cost;
    int currentWeight;
    int maxWeight;
    public boolean launch(){
        return true;
    }
    public boolean land() {
        return true;
    }
    public boolean canCarry(Item item) {
        if((currentWeight + item.weight > maxWeight)){
            return false;
        } else{
            return true;
        }
    }
    public void carry(Item item){
        currentWeight += item.weight;
    }
}
