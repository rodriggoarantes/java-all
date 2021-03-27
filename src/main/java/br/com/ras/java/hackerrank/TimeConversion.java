package br.com.ras.java.hackerrank;

public class TimeConversion {

    public static String solution(String s) {
        String[] time = s.substring(0, 8).split(":");
        String input = s.substring(8, 10);

        if (("AM").equalsIgnoreCase(input) && time[0].equals("12")) {
            time[0] = "00";
        }

        if (("PM").equalsIgnoreCase(input)) {
            int hour = Integer.parseInt(time[0]);
            hour = hour == 12 ? 12 : hour + 12;
            time[0] = String.valueOf(hour);
        }

        return String.format("%s:%s:%s", time[0], time[1], time[2]);
    }
}
