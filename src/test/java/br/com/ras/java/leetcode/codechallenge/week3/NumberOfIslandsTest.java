package br.com.ras.java.leetcode.codechallenge.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;

    @BeforeEach
    void setup() {
        numberOfIslands = new NumberOfIslands();
    }

    @Test
    public void test_case1() {
        char grid[][] = new char[][]
                { { '1','1','1','1','0' },
                { '1','1','0','1','0' },
                { '1','1','0','0','0' },
                { '0','0','0','0','0' } };

        assertThat(numberOfIslands.numIslands(grid), equalTo(1));
    }

    @Test
    public void test_case2() {
        char grid[][] = new char[][]
                {{ '1','1','0','0','0' },
                { '1','1','0','0','0' },
                { '0','0','1','0','0' },
                { '0','0','0','1','1' } };

        assertThat(numberOfIslands.numIslands(grid), equalTo(3));
    }

    @Test
    public void test_case3() {
        char grid[][] = new char[][]{};
        assertThat(numberOfIslands.numIslands(grid), equalTo(0));
    }

    @Test
    public void test_case4() {
        char grid[][] = new char[][]{
                {'1','0','0','1','1','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0'},
                {'1','0','0','1','1','0','0','1','0','0','0','1','0','1','0','1','0','0','1','0'},
                {'0','0','0','1','1','1','1','0','1','0','1','1','0','0','0','0','1','0','1','0'},
                {'0','0','0','1','1','0','0','1','0','0','0','1','1','1','0','0','1','0','0','1'},
                {'0','0','0','0','0','0','0','1','1','1','0','0','0','0','0','0','0','0','0','0'},
                {'1','0','0','0','0','1','0','1','0','1','1','0','0','0','0','0','0','1','0','1'},
                {'0','0','0','1','0','0','0','1','0','1','0','1','0','1','0','1','0','1','0','1'},
                {'0','0','0','1','0','1','0','0','1','1','0','1','0','1','1','0','1','1','1','0'},
                {'0','0','0','0','1','0','0','1','1','0','0','0','0','1','0','0','0','1','0','1'},
                {'0','0','1','0','0','1','0','0','0','0','0','1','0','0','1','0','0','0','1','0'},
                {'1','0','0','1','0','0','0','0','0','0','0','1','0','0','1','0','1','0','1','0'},
                {'0','1','0','0','0','1','0','1','0','1','1','0','1','1','1','0','1','1','0','0'},
                {'1','1','0','1','0','0','0','0','1','0','0','0','0','0','0','1','0','0','0','1'},
                {'0','1','0','0','1','1','1','0','0','0','1','1','1','1','1','0','1','0','0','0'},
                {'0','0','1','1','1','0','0','0','1','1','0','0','0','1','0','1','0','0','0','0'},
                {'1','0','0','1','0','1','0','0','0','0','1','0','0','0','1','0','1','0','1','1'},
                {'1','0','1','0','0','0','0','0','0','1','0','0','0','1','0','1','0','0','0','0'},
                {'0','1','1','0','0','0','1','1','1','0','1','0','1','0','1','1','1','1','0','0'},
                {'0','1','0','0','0','0','1','1','0','0','1','0','1','0','0','1','0','0','1','1'},
                {'0','0','0','0','0','0','1','1','1','1','0','1','0','0','0','1','1','0','0','0'}
        };
        assertThat(numberOfIslands.numIslands(grid), equalTo(58));
    }



}