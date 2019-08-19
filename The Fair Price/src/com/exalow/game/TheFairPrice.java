package com.exalow.game;

import com.exalow.game.utils.DifficultySelector;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TheFairPrice {

    public static void main(String[] args) {

        String answer;
        int maxPrice;
        int input = 0;
        int tries = 0;
        long start = 0;
        long end = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        DifficultySelector difficultySelector = new DifficultySelector();

        maxPrice = DifficultySelector.getMaxPrice();

        int price = random.nextInt(maxPrice);

        System.out.println("\nChoose a number between 0 <-> " + maxPrice);
        start = System.currentTimeMillis();

        while (input != price) {

            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                throw new RuntimeException("Invalid input !");
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

        double time = (end - start) / 1000;

        System.out.println("\nCongratulations, The fair price was " + price + " !");
        System.out.println("\n----------[STATS]----------");
        System.out.println("Time : " + time + "s");
        System.out.println("Tries : " + tries);
        System.out.println("---------------------------");

    }

}
