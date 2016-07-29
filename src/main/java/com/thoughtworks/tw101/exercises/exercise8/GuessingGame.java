package com.thoughtworks.tw101.exercises.exercise8;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by Timothy Foster on 18 Jul 2016.
 */
public class GuessingGame {
    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 100;

    /*  Constructors
     *  =========================================================================*/
    public GuessingGame(IGuessingGamePlayer player, GuessingGameMessenger messenger) {
        this.player = player;
        this.messenger = messenger;
        this.guessHistory = new ArrayList<Integer>();
    }

    /*  Public Methods
     *  =========================================================================*/
    public void play() {
        startGame();
        do nextRound();
        while(!isFinished());
        finishGame();
    }

    /*  Private Members
     *  =========================================================================*/
    private IGuessingGamePlayer player;
    private GuessingGameMessenger messenger;
    private List<Integer> guessHistory;
    private int numberToGuess;
    private int currentGuess;

    /*  Private Methods
     *  =========================================================================*/
    private void nextRound() {
        messenger.guess();

        try {
            currentGuess = player.nextGuess();
        }
        catch(NumberFormatException err) {
            currentGuess = LOWER_BOUND - 1;
            messenger.invalidInput();
            return;
        }

        if(currentGuess < numberToGuess)
            messenger.tooLow();
        else if(currentGuess > numberToGuess)
            messenger.tooHigh();
        guessHistory.add(currentGuess);
    }

    private boolean isFinished() {
        return numberToGuess == currentGuess;
    }

    private void startGame() {
        pickNumber(LOWER_BOUND, UPPER_BOUND);
        currentGuess = LOWER_BOUND - 1;
        guessHistory.clear();
        messenger.startGame(LOWER_BOUND, UPPER_BOUND);
    }

    private void finishGame() {
        messenger.finishGame(numberToGuess);
        messenger.guessHistory(guessHistory);
    }

    private void pickNumber(int lowerBound, int upperBound) {
        numberToGuess = new Random().nextInt(upperBound - lowerBound) + lowerBound;
    }
}