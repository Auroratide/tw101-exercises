package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Timothy Foster on 18 Jul 2016.
 */
public class Orc implements Monster {

    private int hitpoints;

    public Orc() {
        hitpoints = 20;
    }

    public String getName() {
        return "Orc";
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    public void reportStatus() {
        System.out.println(getName() + ": " + getHitpoints());
    }

}