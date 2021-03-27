package br.com.ras.java.hackerrank;

public final class CodingFriends {

    public static int minNum(int samDaily, int kellyDaily, int difference) {
        if (samDaily > kellyDaily) return -1;
        if (difference == 0 && kellyDaily <= samDaily) return -1;

        int days = 0;
        int samSolved = difference;
        int kellySolved = 0;

        while(samSolved >= kellySolved) {
            days++;
            samSolved = samSolved + samDaily;
            kellySolved = kellySolved + kellyDaily;
        }

        return days;
    }
}
