package br.com.ras.java.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingFriendsTest {

    @Test
    void cenario1() {
        int sam = 3, kelly = 5, difference = 5;
        final var days =  CodingFriends.minNum(sam, kelly, difference);

        assertEquals(3, days);
    }

    @Test
    void cenario2() {
        int sam = 4, kelly = 5, difference = 1;
        final var days =  CodingFriends.minNum(sam, kelly, difference);

        assertEquals(2, days);
    }

    @Test
    void cenario3() {
        int sam = 100, kelly = 100, difference = 0;
        final var days =  CodingFriends.minNum(sam, kelly, difference);

        assertEquals(-1, days);
    }

    @Test
    void cenario4() {
        int sam = 2, kelly = 1, difference = 0;
        final var days =  CodingFriends.minNum(sam, kelly, difference);

        assertEquals(-1, days);
    }

}