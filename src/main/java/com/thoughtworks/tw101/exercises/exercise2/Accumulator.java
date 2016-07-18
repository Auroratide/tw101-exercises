package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int timesIncremented;

    public Accumulator() {
        timesIncremented = 0;
    }

    public void increment() {
        ++timesIncremented;
    }

    public void total() {
        System.out.print(timesIncremented);
    }
}
