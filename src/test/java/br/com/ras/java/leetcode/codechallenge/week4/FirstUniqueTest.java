package br.com.ras.java.leetcode.codechallenge.week4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class FirstUniqueTest {

    @Test
    public void test_case1() {
        final FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{2,3,5});
        assertThat(firstUnique.showFirstUnique(), equalTo(2)); // return 2
        firstUnique.add(5);            // the queue is now [2,3,5,5]
        assertThat(firstUnique.showFirstUnique(), equalTo(2)); // return 2
        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        assertThat(firstUnique.showFirstUnique(), equalTo(3)); // return 3
        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        assertThat(firstUnique.showFirstUnique(), equalTo(-1)); // return -1
    }

    @Test
    public void test_case2() {
        final FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{7,7,7,7,7,7});
        assertThat(firstUnique.showFirstUnique(), equalTo(-1));
        firstUnique.add(7);
        firstUnique.add(3);
        firstUnique.add(3);
        firstUnique.add(7);
        firstUnique.add(17);
        assertThat(firstUnique.showFirstUnique(), equalTo(17));
    }

    @Test
    public void test_case3() {
        final FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{809});
        assertThat(firstUnique.showFirstUnique(), equalTo(809));
        firstUnique.add(809);
        assertThat(firstUnique.showFirstUnique(), equalTo(-1));
    }




}