package edu.tseidler;

import edu.tseidler.hanoi.Hanoi;
import edu.tseidler.hanoi.Move;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(5);
        System.out.println("solution of the problem:");
        System.out.println(hanoi);
        hanoi.solution().forEach(m -> applyMoveAndPresent(hanoi, m));
        System.out.println("finished");
    }

    private static void applyMoveAndPresent(Hanoi hanoi, Move m) {
        System.out.println(m);
        System.out.println();
        hanoi.applyMove(m);
        System.out.println(hanoi);
    }
}
