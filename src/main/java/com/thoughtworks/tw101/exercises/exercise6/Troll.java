package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Timothy Foster on 18 Jul 2016.
 */
public class Troll implements Monster {

    private int hitpoints;

    public Troll() {
        hitpoints = 40;
    }

    public String getName() {
        return "Troll";
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void takeDamage(int amount) {
        hitpoints -= Math.floor(amount / 2);
    }

    public void reportStatus() {
        System.out.println(getName() + ": " + getHitpoints());
    }

}