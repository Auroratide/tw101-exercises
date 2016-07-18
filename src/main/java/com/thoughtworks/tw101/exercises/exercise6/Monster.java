package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Timothy Foster on 18 Jul 2016.
 */
public interface Monster {
//  This could be refactored as a class since both the Orc and Troll derivatives
//  have hitpoints and names.
    void takeDamage(int amount);
    void reportStatus();
}