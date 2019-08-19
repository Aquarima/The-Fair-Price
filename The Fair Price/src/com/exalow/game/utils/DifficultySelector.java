package com.exalow.game.utils;

import com.exalow.game.entity.Difficulty;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DifficultySelector {

    private static Difficulty d;
    private List<Difficulty> difficulties = new LinkedList<>();
    private static String input;
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

            break;

        }

    }

    public final static int getMaxPrice() {
        maxPrice = d.valueOf(input).getMaxPrice();
        return maxPrice;
    }

}
