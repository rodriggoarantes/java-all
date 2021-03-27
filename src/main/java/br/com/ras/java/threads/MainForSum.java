package br.com.ras.java.threads;

import br.com.ras.java.shared.LogUtil;


public class MainForSum extends LogUtil {

    public static int number = 0;

    public static void main(String[] args) {
        cenarioUm();
    }

    private static void cenarioUm() {
        outln("-------- Cenario Um -----------");
        final var task1 = new Thread(new ForSumTask());
        final var task2 = new Thread(new ForSumTask());
        final var task3 = new Thread(new ForSumTask());
        final var task4 = new Thread(new ForSumTask());
        final var task5 = new Thread(new ForSumTask());

        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();

        outln(" === Result = " + number + "====");
    }

}
