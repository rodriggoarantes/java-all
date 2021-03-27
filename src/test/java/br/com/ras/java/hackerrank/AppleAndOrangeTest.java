package br.com.ras.java.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Apple and Orange")
class AppleAndOrangeTest {

    @Test
    void solution() {
        final var casa1 = 7;
        final var casa2 = 10;
        final var arvoreMaca = 4;
        final var arvoreLaranja = 12;
        final var macas = new int[]{2, 3, -4};
        final var laranjas = new int[]{3, -2, -4};


        final var maca = AppleAndOrange.solution(casa1, casa2, arvoreMaca, macas);
        final var laranja = AppleAndOrange.solution(casa1, casa2, arvoreLaranja, laranjas);

        assertEquals(1, maca);
        assertEquals(2, laranja);
    }
}