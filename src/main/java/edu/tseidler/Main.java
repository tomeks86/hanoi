package edu.tseidler;

import edu.tseidler.hanoi.Hanoi;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(10);
        System.out.println("solution of the problem:");
        System.out.println(hanoi);
        hanoi.solve();
        System.out.println("finished");
    }
}
