package edu.tseidler.hanoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Hanoi {
    private List<Stack<Block>> board;
    private final int blocks;

    public Hanoi(int blocks) {
        this.board = new ArrayList<>();
        this.blocks = blocks;
        for (int i = blocks; i >= 1 ; i--) {
            board.get(0).push(new Block(i));
        }
    }

    public Move[] getSolution(){
        return null;
    }
}
