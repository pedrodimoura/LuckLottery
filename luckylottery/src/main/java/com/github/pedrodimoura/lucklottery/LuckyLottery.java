package com.github.pedrodimoura.lucklottery;

import android.content.Context;

import io.kimo.lib.faker.Faker;

/**
 * Created by pedrodimoura on 06/04/18.
 */

public class LuckyLottery {

    private static LuckyLottery sInstance;

    private LuckyLottery(){}

    public static LuckyLottery instance() {
        if (sInstance == null) {
            synchronized (LuckyLottery.class) {
                if (sInstance == null) sInstance = new LuckyLottery();
            }
        }
        return sInstance;
    }

    /**
     * This method returns a awesome integer
     * @return awesome integer
     */
    public int[] showMeLuckyNumbers(Context aContext) {

        int[] luckyNumbers = new int[5];

        Faker.with(aContext);

        for (int i = 0; i < luckyNumbers.length;) {
            int currentNumber = Faker.Number.number(2);

            if (currentNumber > 0 && currentNumber <= 60) {
                luckyNumbers[i] = currentNumber;
                i++;
            }
        }

        return luckyNumbers;
    }

}
