package br.com.ras.java.hackerrank;

import java.util.LinkedList;

public class IsPossible {

    public static class Par {
        Integer a;
        Integer b;

        public Par(Integer a, Integer b) {
            this.a = a;
            this.b = b;
        }
    }

    public static String isPossible(int a, int b, int c, int d) {
        final LinkedList<Par> pares = new LinkedList<>();
        pares.add(new Par(a, b));

        while (!pares.isEmpty()) {
            Par par = pares.poll();

            if (par.a.equals(c) && par.b.equals(d)) {
                return "Yes";
            }

            int soma = par.a + par.b;
            if (soma <= c) {
                pares.addLast(new Par(soma, par.b));
            }
            if (soma <= d) {
                pares.addLast(new Par(par.a, soma));
            }
        }

        return "No";
    }
}
