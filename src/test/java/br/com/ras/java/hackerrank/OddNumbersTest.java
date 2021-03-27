package br.com.ras.java.hackerrank;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName(" Teste de numeros impares em um intervalo definido ")
class OddNumbersTest {

    @Test
    void numerosImpares() {
        final var result = OddNumbers.solution(2, 5);

        assertTrue(result.containsAll(List.of(3, 5)));
    }
}