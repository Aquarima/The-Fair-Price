package com.exalow.game.utils;

import com.exalow.game.TheFairPrice;

public class Statistics {

    private long time = TheFairPrice.getTime();
    private int tries = TheFairPrice.getTries();

    public final void getStatistics() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----------[STATS]----------");
        stringBuilder.append("\n         Time : " + time + "s");
        stringBuilder.append("\n         Tries : " + tries);
        stringBuilder.append("\n---------------------------");

        System.out.println(stringBuilder);
    }

}
