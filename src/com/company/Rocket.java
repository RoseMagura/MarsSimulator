package com.company;

public class Rocket implements SpaceShip {
    int currentWeight = 0;
    int maxWeight = 0;
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
    public int carry(Item item){
        currentWeight += item.weight;
        return currentWeight;
    }
}
