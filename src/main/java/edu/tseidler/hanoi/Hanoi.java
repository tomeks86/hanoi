package edu.tseidler.hanoi;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Stack;

import static edu.tseidler.hanoi.Stick.FIRST;

public class Hanoi {
    private EnumMap<Stick, BlockStack> board;
    private final int blocks;

    public Hanoi(int blocks) {
        this.board = new EnumMap<>(Stick.class);
        for (Stick stick : Stick.values()) {
            this.board.put(stick, new BlockStack());
        }
        this.blocks = blocks;
        for (int i = blocks; i >= 1 ; i--) {
            board.get(FIRST).push(new Block(i));
        }
    }
}
