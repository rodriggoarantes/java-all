package br.com.ras.java.hackerhank;

import org.junit.Assert;
import org.junit.Test;

public class TimeConversionTest {

    @Test
    public void testSolution_am() {
        final var s = "12:00:00AM";

        final var result = TimeConversion.solution(s);

        Assert.assertEquals("00:00:00", result);
    }

    @Test
    public void testSolution_pm() {
        final var s = "12:00:00PM";

        final var result = TimeConversion.solution(s);

        Assert.assertEquals("12:00:00", result);
    }

    @Test
    public void testSolution_5PM() {
        final var s = "05:00:00PM";

        final var result = TimeConversion.solution(s);

        Assert.assertEquals("17:00:00", result);
    }

    @Test
    public void testSolution_5AM() {
        final var s = "05:00:00AM";

        final var result = TimeConversion.solution(s);

        Assert.assertEquals("05:00:00", result);
    }
}