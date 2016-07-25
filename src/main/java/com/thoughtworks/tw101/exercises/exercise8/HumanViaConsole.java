package com.thoughtworks.tw101.exercises.exercise8;

import java.util.InputMismatchException;
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
    public int nextGuess() throws NumberFormatException {
        try {
            return scanner.nextInt();
        }
        catch(InputMismatchException err) {
            scanner.nextLine(); // eliminate bad input
            throw new NumberFormatException();
        }
    }

    /*  Private Members
     *  =========================================================================*/
    private Scanner scanner;

}