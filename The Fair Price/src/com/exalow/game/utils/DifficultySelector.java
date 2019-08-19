package com.exalow.game.utils;

import com.exalow.game.entity.Difficulty;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DifficultySelector {

    private Difficulty d;
    private List<Difficulty> difficulties = new LinkedList<>();
    private String input;
    private Difficulty difficulty;
    private static int maxPrice;

    public DifficultySelector() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Difficulty : ");

            for (Difficulty difficulty : Difficulty.values()) {
                StringBuilder stringBuilder = new StringBuilder(" - ");
                stringBuilder.append(difficulty);
                System.out.println(stringBuilder);
                difficulties.add(difficulty);
            }

            System.out.print("\n Difficulty -> ");
            input = scanner.nextLine().toUpperCase();

            try {
                difficulty = Difficulty.valueOf(input);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("[ERROR] Invalid difficulty !");
            }

            switch (input) {
                case "ESAY":
                    maxPrice = d.ESAY.getMaxPrice();
                    break;
                case "MEDIUM":
                    maxPrice = d.MEDIUM.getMaxPrice();
                    break;
                case "HARD":
                    maxPrice = d.HARD.getMaxPrice();
                    break;
                default:
            }

            break;

        }

    }

    public static int getMaxPrice() {
        return maxPrice;
    }
}
