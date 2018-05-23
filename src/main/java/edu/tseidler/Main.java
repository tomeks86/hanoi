package edu.tseidler;

import edu.tseidler.hanoi.Hanoi;
import edu.tseidler.hanoi.Move;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(4);
        for (Move move : hanoi.solution()) {
            System.out.println(move);
        }
    }
}
