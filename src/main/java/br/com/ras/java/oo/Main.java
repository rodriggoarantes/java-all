package br.com.ras.java.oo;

@SuppressWarnings("all")
public class Main {
    
    public static void main(String[] args) {
        
        A ab = new B();
        B b = new B();
        C c = new C();
        // b = c; -- error

        ab = c;


        int k = 9;
        doit(1, 2, k);
        System.out.println(k);
    }


    static void doit(int x, int y, int z) {
        z = 1;
    }
}
