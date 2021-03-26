package br.com.ras.java.hackerhank;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BirthdayCakeCandlesTest {

    @Test
    public void testSolution_1() {
        final var list = List.of(3,2, 1, 3);

        final var result = BirthdayCakeCandles.solution(list);

        assertEquals(2, result);
    }

    @Test
    public void testSolution_2() {
        final var list = List.of(4 , 4, 1, 3);

        final var result = BirthdayCakeCandles.solution(list);

        assertEquals(2, result);
    }

    @Test
    public void testSolution_3() {
        final var list = List.of(4 , 4, 1, 3, 3, 2, 4);

        final var result = BirthdayCakeCandles.solution(list);

        assertEquals(3, result);
    }
}