package br.com.ras.java.hackerhank;

import java.util.List;

public class BirthdayCakeCandles {

    public static int solution(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (Integer candle : candles) {
            if (candle > max) {
                max = candle;
                count = 1;
            } else if (candle == max) {
                count++;
            }
        }

        return count;
    }
}
