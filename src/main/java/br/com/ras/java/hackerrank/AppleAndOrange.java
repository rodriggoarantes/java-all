package br.com.ras.java.hackerrank;

public class AppleAndOrange {

    @SuppressWarnings("all")
    private void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        final var macas = solution(s, t, a, apples);
        final var laranjas = solution(s, t, b, oranges);

        System.out.println(macas);
        System.out.println(laranjas);
    }

    public static int solution(int s, int t, int tree, int[] fruits) {
        int onHouse = 0;
        for (int fruta : fruits) {
            int pos = tree + fruta;
            if (pos >= s && pos <= t) {
                onHouse++;
            }
        }
        return onHouse;
    }




}
