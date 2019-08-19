package com.exalow.game.utils;

import java.util.Scanner;

public class Difficulty {

    enum Difficuties {

        EASY(1000), MEDIUM(5000), HARD(10000);

        private int maxPrice;

        Difficuties(int maxPrice) {
            this.maxPrice = maxPrice;
        }
    }

    private Difficuties difficulty;

    public void setDifficulty() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Difficulty : ");

        for (Difficuties difficulties : Difficuties.values()) {
            StringBuilder stringBuilder = new StringBuilder(" - ");
            stringBuilder.append(difficulties);
            System.out.println(stringBuilder);
        }

        System.out.print("\n Difficulty -> ");
        String input = scanner.nextLine().toUpperCase();

        try {
            difficulty = Difficuties.valueOf(input);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid difficulty !");
        }

        System.out.println(difficulty);

    }

}
