package com.exalow.game.core;

import com.exalow.game.utils.Difficulty;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FairPrice {

    private Difficulty d;
    private String difficulty = Difficulty.getSelectedDifficulty();
    private int maxPrice;
    private int price;
    private static int tries;
    private static long start, end;

    public FairPrice() {

        int input = 0;
        tries = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        maxPrice = Difficulty.Difficuties.valueOf(difficulty).getMaxPrice();
        price = random.nextInt(maxPrice);

        System.out.println("\nChoose a number between 0 <-> " + maxPrice);

        start = System.currentTimeMillis();
        while (input != price) {

            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                throw new RuntimeException("Invalid value !");
            }

            if (input > maxPrice) {
                System.err.println("Price cannot be greater than " + maxPrice + " !");
            } else if (input < price) {
                System.out.println("More !");
            } else {
                System.out.println("Less !");
            }

            tries++;

        }
        end = System.currentTimeMillis();

        System.out.println("\nCongratulations, The fair price was " + price + " !");

    }

    public static long getTime() {
        return (end - start) / 1000;
    }

    public static int getTries() {
        return tries;
    }
}
