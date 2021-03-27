package br.com.ras.java.hackerrank;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;


public class DiagonalDiferenceTest {

    @Test
    public void testResult_zero() {
        final var matriz = List.of(List.of(1, 2, 3),
                                   List.of(4, 5, 6),
                                   List.of(7, 8, 9));

        Assert.assertEquals(0, DiagonalDiference.result(matriz));
    }

    @Test
    public void testResult_sample() {
        final var matriz = List.of(List.of(11, 2, 4),
                                   List.of(4, 5, 6),
                                   List.of(10, 8, -12));

        Assert.assertEquals(15, DiagonalDiference.result(matriz));
    }
}