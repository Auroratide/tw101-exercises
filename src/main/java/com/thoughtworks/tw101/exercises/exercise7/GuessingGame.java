package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

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
    private int numberToGuess;
    private int currentGuess;

/*  Private Methods
 *  =========================================================================*/
    private void nextRound() {
        messenger.guess();
        currentGuess = player.nextGuess();
        if(currentGuess < numberToGuess)
            messenger.tooLow();
        else if(currentGuess > numberToGuess)
            messenger.tooHigh();
    }

    private boolean isFinished() {
        return numberToGuess == currentGuess;
    }

    private void startGame() {
        pickNumber(LOWER_BOUND, UPPER_BOUND);
        currentGuess = -1;
        messenger.startGame(LOWER_BOUND, UPPER_BOUND);
    }

    private void finishGame() {
        messenger.finishGame(numberToGuess);
    }

    private void pickNumber(int lowerBound, int upperBound) {
        numberToGuess = new Random().nextInt(upperBound - lowerBound) + lowerBound;
    }
}