package com.thoughtworks.tw101.exercises.exercise8;

import java.io.PrintStream;
import java.util.Collection;

/**
 * Created by Timothy Foster on 25 Jul 2016.
 */
public class GuessingGameMessenger {

    /*  Constructors
     *  =========================================================================*/
    public GuessingGameMessenger(PrintStream stream) {
        this.stream = stream;
    }

    /*  Public Methods
     *  =========================================================================*/
    public void startGame(int lowerbound, int upperbound) {
        stream.print("Pick a number between " + lowerbound + " and " + upperbound + "\n");
    }

    public void guess() {
        stream.print("> ");
    }

    public void tooLow() {
        stream.print("Guess higher!\n");
    }

    public void tooHigh() {
        stream.print("Guess lower!\n");
    }

    public void invalidInput() {
        stream.print("You did not input a proper number.\n");
    }

    public void finishGame(int finalNumber) {
        stream.print("Congrats!  The correct number was " + finalNumber + "\n");
    }

    public void guessHistory(Collection<Integer> guesses) {
        stream.print("You guessed: ");
        for(Integer guess : guesses)
            stream.print(guess + ", ");
        stream.print("\n");
    }

    /*  Private Members
     *  =========================================================================*/
    private PrintStream stream;

}