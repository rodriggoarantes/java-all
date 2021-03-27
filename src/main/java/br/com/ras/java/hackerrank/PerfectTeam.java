package br.com.ras.java.hackerrank;

import java.util.*;

public class PerfectTeam {

    public static int solution(String skills) {

        int teams = 0;
        final Map<Character, Integer> items = new HashMap<>();
        char[] chars = skills.toCharArray();

        for (int i=0; i < chars.length; i++) {
            final Character letra = Character.valueOf(chars[i]);

            items.put(letra, items.getOrDefault(letra, 0) + 1);

            if (items.size() == 5) {
                teams++;
                final Set<Character> eliminar = new HashSet<>(0);
                items.keySet().forEach(c -> {
                    int count = items.getOrDefault(c, 0) - 1;
                    if (count > 0) {
                        items.put(c, count);
                    } else {
                        eliminar.add(c);
                    }
                });
                eliminar.forEach(key -> items.remove(key));
            }
        }

        return teams;
    }
}
