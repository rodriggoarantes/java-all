package br.com.ras.java.hackerhank;

public class PlusMinus {

    public static final int[] CASE1 = new int[] {-4, 3, -9, 0, 4, 1};

    public static void main(String[] args) {
        plusMinus(CASE1);
    }

    static void plusMinus(int[] arr) {
        String[] messages = solution(arr);

        for (String m : messages) {
            System.out.println(m);
        }
    }


    public static String[] solution(int[] arr) {
        String[] result = new String[3];
        int length = arr.length;
        double isPlus = 0;
        double isMinus = 0;
        double isZero = 0;

        for (final int valor : arr) {
            if (valor > 0) {
                isPlus++;
            } else if (valor < 0) {
                isMinus++;
            } else {
                isZero++;
            }
        }

        result[0] = String.format("%.6f", isPlus / length);
        result[1] = String.format("%.6f", isMinus / length);
        result[2] = String.format("%.6f", isZero / length);

        return result;
    }
}
