package br.com.ras.java.threads;

import br.com.ras.java.shared.LogUtil;

public class ForSumTask extends LogUtil implements Runnable {

    @Override
    public void run() {
        for (int i=0; i < 10000000; i++) {
            MainForSum.number = MainForSum.number + 1;
        }
    }

}
