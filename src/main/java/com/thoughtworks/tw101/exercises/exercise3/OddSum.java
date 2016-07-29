package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        start = nextOdd(start);
        int sum = 0;
        for(int i = start; i < end; i += 2)
            sum += i;
        return sum;
    }

    private int nextOdd(int n) {
        if(n % 2 == 0)
            return n + 1;
        else
            return n;
    }
}
