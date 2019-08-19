package com.exalow.game;

import com.exalow.game.utils.DifficultySelector;
import com.exalow.game.utils.Statistics;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TheFairPrice {

    private static int tries;
    private static long start = 0;
    private static long end = 0;

    public static void main(String[] args) {

        int input = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        DifficultySelector difficultySelector = new DifficultySelector();

        int maxPrice = DifficultySelector.getMaxPrice();
        int price = random.nextInt(maxPrice);

        System.out.println("\nChoose a number between 0 <-> " + maxPrice);

        start = System.currentTimeMillis();
        while (input != price) {

            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                throw new RuntimeException("Invalid value !");
            }

            if (input > maxPrice) {
                System.err.println("[ERROR] Price cannot be greater than " + maxPrice + " !");
            } else if (input < price) {
                System.out.println("\nMore !");
            } else {
                System.out.println("Less !");
            }

            tries++;

        }
        end = System.currentTimeMillis();

        System.out.println("\nCongratulations, The fair price was " + price + " !");

        new Statistics().getStatistics();

    }

    public static long getTime() {
        return (end - start) / 1000;
    }

    public static int getTries() {
        return tries;
    }
}
