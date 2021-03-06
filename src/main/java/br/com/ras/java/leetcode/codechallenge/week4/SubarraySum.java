package br.com.ras.java.leetcode.codechallenge.week4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Subarray Sum Equals K
 *
 * Given an array of integers and an integer k, you need to find the total number
 *  of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 *
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 *
 * Note:
 *
 *     The length of the array is in range [1, 20,000].
 *     The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 *
 *    Hide Hint #1
 * Will Brute force work here? Try to optimize it.
 *    Hide Hint #2
 * Can we optimize it by using some extra space?
 *    Hide Hint #3
 * What about storing sum frequencies in a hash table? Will it be useful?
 *    Hide Hint #4
 * sum(i,j)=sum(0,j)-sum(0,i), where sum(i,j) represents the sum of all the elements from index i to j-1.
 * Can we use this property to optimize it.
 *
 *
 */
public class SubarraySum {

    public int solution(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return (nums[0] == k) ? 1 : 0;
        }

        Map<Integer, Integer> store = new HashMap<>(0);
        store.put(0, 1);
        int sums = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sums += nums[i];

            if (store.containsKey(sums - k)) {
                result += store.get(sums - k);
            }
            store.merge(sums, 1, Integer::sum);
        }
        return result;
    }
}
