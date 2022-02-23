package br.com.ras.java.hackerrank;

import java.util.ArrayList;
import java.util.List;

public final class OddNumbers {

    public static List<Integer> solution(int l, int r) {
        final List<Integer> impares = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 > 0) {
                impares.add(i);
            }
        }

        return impares;
    }
}
