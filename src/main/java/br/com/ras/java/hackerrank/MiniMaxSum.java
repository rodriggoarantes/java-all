package br.com.ras.java.hackerrank;

public class MiniMaxSum {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        miniMaxSum(array);
        alternative(array);
    }

    static void miniMaxSum(int[] arr) {
        long[] result = solution(arr);

        System.out.println(result[0] + " " + result[1]);
    }

    static long[] solution(int[] arr) {
        int length = arr.length;
        long max = 0;
        long min = 0;

        for (int i=0; i < length; i++) {
            long minidx = sumall(i, arr);
            long maxidx = sumall(i, arr);

            if (i == 0) {
                min = minidx;
                max = maxidx;
            }
            if (minidx < min) {
                min = minidx;
            }
            if (maxidx > max) {
                max = minidx;
            }
        }

        return new long[]{min, max};
    }

    static long sumall(int ignoreIndex, int[] arr) {
        long sum = 0;
        for (int index = 0; index < arr.length; index++) {
            if (ignoreIndex != index) {
                sum += arr[index];
            }
        }
        return sum;
    }

    // ----------------------------------------------------

    static void alternative(int[] arr) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            long n = arr[i];
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
