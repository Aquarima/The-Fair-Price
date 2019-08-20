package com.exalow.game.core;

import com.exalow.game.utils.Difficulty;

public class FairPrice {

    private Difficulty d = new Difficulty();
    private int maxPrice = new Difficulty().getMaxPrice();

    public FairPrice() {

        System.out.println(maxPrice);

    }

}
