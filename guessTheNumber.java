package com.amanedan;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean running2 = true;

        while (running2) {

            System.out.println("Game Started");

            //generates random number
            Random rand = new Random();
            int highestRand = 1001;
            int randNum = rand.nextInt(highestRand);

            //asks for user input
            System.out.println("Hello, thank you for playing 'guess the number'! Please input a guess between 0 and 1000");

            //keeps the game running to allow multiple guesses
            boolean running = true;
            while (running) {

                //takes user input
                Scanner userInput = new Scanner(System.in);
                int playerGuess = userInput.nextInt();

                //checks if guess is right, to low, or to high.
                if (playerGuess == randNum) {
                    System.out.println("Congratulation! You guessed the number!");
                    System.out.println("Game Ended");
                    //stops the game when you win
                    break;
                } else if (playerGuess < randNum) {
                    System.out.println("Wrong! Guess higher dumbass!");
                } else {
                    System.out.println("Wrong! Guess lower dumbass!");
                }
            }
        }
    }
}
