package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Timothy Foster on 25 Jul 2016.
 */
public class HumanViaConsole implements IGuessingGamePlayer {

/*  Constructors
 *  =========================================================================*/
    public HumanViaConsole() {
        scanner = new Scanner(System.in);
    }
 
/*  Public Methods
 *  =========================================================================*/
    public int nextGuess() {
        return scanner.nextInt();
    }

/*  Private Members
 *  =========================================================================*/
    private Scanner scanner;

}