package edu.tseidler.hanoi;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

import static edu.tseidler.hanoi.Stick.*;

public class Hanoi {
    private EnumMap<Stick, BlockStack> board;
    private final int blocks;

    public Hanoi(int blocks) {
        this.blocks = blocks;
        this.board = new EnumMap<>(Stick.class);
        for (Stick stick : Stick.values()) {
            this.board.put(stick, new BlockStack());
        }
        for (int i = blocks; i >= 1; i--) {
            board.get(START).push(new Block(i));
        }
    }

    public List<Move> solution() {
        return moveNSticks(Stick.START, Stick.TARGET, blocks, new LinkedList<>());
    }

    private Move moveOneBlock(Stick from, Stick to) {
        System.out.println(this);
        Move move = new Move(from, to);
        System.out.println(move + "\n");
        moveBlockOnBoard(from, to);
        return move;
    }

    private void moveBlockOnBoard(Stick from, Stick to) {
        board.get(to).push(board.get(from).pop());
    }

    private List<Move> moveNSticks(Stick from, Stick to, int n, List<Move> moves) {
        if (n == 1) {
            moves.add(moveOneBlock(from, to));
            return moves;
        }
        Stick temp = Stick.temp(from, to);
        moveNSticks(from, temp, n - 1, moves);
        moves.add(moveOneBlock(from, to));
        moveNSticks(temp, to, n - 1, moves);
        return moves;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Stick stick : Stick.values()) {
            sb.append((stick.ordinal() + 1) + ": ")
                    .append(board.get(stick))
                    .append("\n");
        }
        return sb.toString();
    }
}
