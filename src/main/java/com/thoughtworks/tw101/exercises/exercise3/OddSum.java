package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        start += (start + 1) % 2; // force to be odd
        int sum = 0;
        for(int i = start; i < end; i += 2)
            sum += i;
        return sum;
    }
}
