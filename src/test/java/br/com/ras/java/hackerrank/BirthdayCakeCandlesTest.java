package br.com.ras.java.hackerrank;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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