package br.com.ras.java.hackerrank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConversionTest {

    @Test
    public void testSolution_am() {
        final var s = "12:00:00AM";

        final var result = TimeConversion.solution(s);

        assertEquals("00:00:00", result);
    }

    @Test
    public void testSolution_pm() {
        final var s = "12:00:00PM";

        final var result = TimeConversion.solution(s);

        assertEquals("12:00:00", result);
    }

    @Test
    public void testSolution_5PM() {
        final var s = "05:00:00PM";

        final var result = TimeConversion.solution(s);

        assertEquals("17:00:00", result);
    }

    @Test
    public void testSolution_5AM() {
        final var s = "05:00:00AM";

        final var result = TimeConversion.solution(s);

        assertEquals("05:00:00", result);
    }
}