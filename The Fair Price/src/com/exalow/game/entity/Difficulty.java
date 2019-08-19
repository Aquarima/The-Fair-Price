package com.exalow.game.entity;

public enum Difficulty {

    ESAY(1000), MEDIUM(5000), HARD(10000);

    private int maxPrice;

    Difficulty(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}