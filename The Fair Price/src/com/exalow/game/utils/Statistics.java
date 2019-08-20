package com.exalow.game.utils;

import com.exalow.game.core.FairPrice;

public class Statistics {

    private long time = FairPrice.getTime();
    private int tries = FairPrice.getTries();

    public final void getStatistics() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----------[STATS]----------");
        stringBuilder.append("\n         Time : " + time + "s");
        stringBuilder.append("\n         Tries : " + tries);
        stringBuilder.append("\n---------------------------");

        System.out.println(stringBuilder);
    }

}
