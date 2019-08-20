package com.exalow.game;

import com.exalow.game.core.FairPrice;
import com.exalow.game.utils.Difficulty;
import com.exalow.game.utils.Statistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        while (play) {

            new Difficulty().Difficulty();
            new FairPrice();
            new Statistics().getStatistics();

            System.out.println("\nPlay Again ? (Y/N)");
            System.out.print(" -> ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("Y")) {
                play = false;
            }

        }

    }
}
