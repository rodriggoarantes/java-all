package br.com.ras.java.tests;

import java.util.List;

public class A {
    public void print() {
        System.out.println("A");
    }

    public List<String> teste() {
        final List<String> d = List.of("teste");
        return d;
    }
}
