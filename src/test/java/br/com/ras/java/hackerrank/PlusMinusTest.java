package br.com.ras.java.hackerrank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlusMinusTest {

    @Test
    void testSolution() {

        final var case1 = PlusMinus.CASE1;

        // then
        final var resultados = PlusMinus.solution(case1);

        assertEquals("0,500000", resultados[0]);
        assertEquals("0,333333", resultados[1]);
        assertEquals("0,166667", resultados[2]);

    }
}