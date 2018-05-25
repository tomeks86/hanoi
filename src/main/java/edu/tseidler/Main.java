package edu.tseidler;

import edu.tseidler.hanoi.Hanoi;
import edu.tseidler.hanoi.Move;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(30);
        System.out.println("solution of the problem:");
        System.out.println(hanoi);
        hanoi.solve();
        System.out.println("finished");
    }

    private static void applyMoveAndPresent(Hanoi hanoi, Move m) {
        System.out.println(m);
        System.out.println();
        hanoi.applyMoveToBoard(m);
        System.out.println(hanoi);
    }
}
