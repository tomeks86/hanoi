package edu.tseidler.hanoi;

import java.util.EnumMap;

import static edu.tseidler.hanoi.Stick.FIRST;

public class Hanoi {
    private EnumMap<Stick, BlockStack> board;

    public Hanoi(int blocks) {
        this.board = new EnumMap<>(Stick.class);
        for (Stick stick : Stick.values()) {
            this.board.put(stick, new BlockStack());
        }
        for (int i = blocks; i >= 1 ; i--) {
            board.get(FIRST).push(new Block(i));
        }
    }
}
