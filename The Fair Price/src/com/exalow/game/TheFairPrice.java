package com.exalow.game;

import com.exalow.game.utils.DifficultySelector;
import com.exalow.game.utils.Statistics;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TheFairPrice {

    private static long time;
    private static int tries;

    public static void main(String[] args) {

        String answer;
        int input = 0;
        long start = 0;
        long end = 0;

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

        time = (end - start) / 1000;

        System.out.println("\nCongratulations, The fair price was " + price + " !");

        new Statistics().getStatistics();

    }

    public static long getTime() {
        return time;
    }

    public static int getTries() {
        return tries;
    }
}
