package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        printCollection(primeFactors);
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();

    //  Note that invalid input, like -30, will return an empty list
        while(n > 1) {
            int factorCandidate = 2;
        //  Can be optimized by incrementing by 2 after checking 3, since primes must be odd after 2
            while(n % factorCandidate != 0)
                ++factorCandidate;
            factors.add(factorCandidate);
            n /= factorCandidate;
        }
        return factors;
    }

    private static void printCollection(Collection<?> collection) {
        for(Object obj : collection)
            System.out.println(obj.toString());
    }
}
